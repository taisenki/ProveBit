package org.provebit.ui.general;

import org.junit.*;
import org.provebit.ui.RunGUI;
import org.uispec4j.Panel;
import org.uispec4j.TabGroup;
import org.uispec4j.UISpecTestCase;
import org.uispec4j.Window;
import org.uispec4j.interception.MainClassAdapter;

public class GeneralViewTest extends UISpecTestCase {
	private Window window;
	private Panel generalPane;
	
	public void setUp() throws Exception {
		super.setUp();
		
		setAdapter(new MainClassAdapter(RunGUI.class, new String[0]));
		window = getMainWindow();
		TabGroup tabGroup = window.getTabGroup("Main");
		tabGroup.selectTab("General");
		generalPane = tabGroup.getSelectedTab();
	}

//	@Test
//	public void testTableHeader() {
//		assertTrue(panel.getTable().getHeader().contentEquals(new String[] {
//				"File", "Status"
//		}));
//	}
	
	public void testTableHeader() {
		assertTrue(generalPane.getTable().getHeader().contentEquals(new String[] {
				"File", "Status"
		}));
	}
}