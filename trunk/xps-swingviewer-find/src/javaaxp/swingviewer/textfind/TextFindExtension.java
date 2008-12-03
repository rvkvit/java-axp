package javaaxp.swingviewer.textfind;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javaaxp.swingviewer.IUIExtension;
import javaaxp.swingviewer.IXPSPageViewer;
import javaaxp.swingviewer.PageController;
import javaaxp.swingviewer.SwingViewerContext;
import javaaxp.swingviewer.textfind.impl.XPSFileSearcher;
import javaaxp.swingviewer.textfind.matchhighlighter.GlyphHighlighterListener;
import javaaxp.swingviewer.textfind.ui.FindPanel;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class TextFindExtension implements IUIExtension, IFindPanelListener{

	public static class FindPanelRemover implements IFindPanelListener {

		private SwingViewerContext fContext;
		private Container fPrevContentPane;

		public FindPanelRemover(SwingViewerContext ctx, Container prevConentPanel) {
			fContext = ctx;
			fPrevContentPane = prevConentPanel;
		}

		@Override
		public void findPanelClosed() {
			fContext.getUI().setContentPane(fPrevContentPane);
			fContext.getUI().validate();
		}

		@Override
		public void findPanelShown() {
		}

		@Override
		public void searchStarted(String searchString) {
		}

		@Override
		public void searchEnded(String searchString, boolean foundMatch) {
			// TODO Auto-generated method stub
			
		}

	}

	private JMenuItem fFindMenuItem;
	protected PageController fCurentPageController;
	protected IXPSPageViewer fCurrentViewer;

	@Override
	public void documentShown(SwingViewerContext ctx) {
		fCurentPageController = ctx.getCurrentDocumentPageController();
		fCurrentViewer = ctx.getPageViewer();
		fFindMenuItem.setEnabled(fCurentPageController != null);
	}

	@Override
	public void init(final SwingViewerContext ctx) {
		JMenuBar jmb = ctx.getUI().getJMenuBar();
		JMenu editMenu = new JMenu(Messages.TextFindExtension_EditMenu);
		fFindMenuItem = editMenu.add(Messages.TextFindExtension_FindMenuItem);
		fFindMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK));
		fFindMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TextFindController fdc = new TextFindController(new XPSFileSearcher(fCurentPageController));
				fdc.addFindPanelListener(TextFindExtension.this);
				fdc.addFindPanelListener(new GlyphHighlighterListener(fCurrentViewer));
				FindPanel fp = new FindPanel(fdc);
				JPanel jp = new JPanel();
				jp.setLayout(new BorderLayout());
				final Container prevConentPanel = ctx.getUI().getContentPane(); 
				jp.add(prevConentPanel, BorderLayout.CENTER);
				jp.add(fp, BorderLayout.NORTH);
				ctx.getUI().setContentPane(jp);
				ctx.getUI().validate();
				fdc.findPanelShown();
				fdc.addFindPanelListener(new FindPanelRemover(ctx, prevConentPanel));
			}
		});
		jmb.add(editMenu);
		fFindMenuItem.setEnabled(false);
	}

	PageController getCurrentPageController(){
		return fCurentPageController;
	}

	@Override
	public void findPanelClosed() {
		fFindMenuItem.setEnabled(true);
		
	}

	@Override
	public void findPanelShown() {
		fFindMenuItem.setEnabled(false);
		
	}

	@Override
	public void searchEnded(String searchString, boolean foundMatch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchStarted(String searchString) {
		// TODO Auto-generated method stub
		
	}
	

}