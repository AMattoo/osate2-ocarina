package org.osate.ocarina;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class PreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	private TabFolder folder;

	public PreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Ocarina configuration page.\n\nNote you should first install Ocarina. See documentation for more details");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {

		// First tab: configuration of Ocarina	
		addTab("Ocarina");
		
		addField(new NoCheckDefaultDirectoryFieldEditor(PreferenceConstants.OCARINA_PATH,
				"&Path to Ocarina bin/ directory:", getFieldEditorParent()));
		
		// Tab for external tools
		addTab("External tools");
		
		addField(new NoCheckDefaultDirectoryFieldEditor(PreferenceConstants.GCC_PATH,
				"&Path to gcc bin/ directory:", getFieldEditorParent()));
		
		addField(new NoCheckDefaultDirectoryFieldEditor(PreferenceConstants.CHEDDAR_PATH,
				"&Path to Cheddar bin/ directory:", getFieldEditorParent()));
		
		addField(new NoCheckDefaultDirectoryFieldEditor(PreferenceConstants.MAST_PATH,
				"&Path to MAST bin/ directory:", getFieldEditorParent()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
    /**
     * Adjust the layout of the field editors so that they are properly aligned.
     */
    protected void adjustGridLayout()
    {
        if (folder != null)
        {
            TabItem[] items = folder.getItems();
            for (int j = 0; j < items.length; j++)
            {
                GridLayout layout = ((GridLayout) ((Composite) items[j].getControl()).getLayout());
                layout.numColumns = 3;
                layout.marginHeight = 5;
                layout.marginWidth = 5;
            }
        }

        // need to call super.adjustGridLayout() since fieldEditor.adjustForNumColumns() is protected
        super.adjustGridLayout();

        // reset the main container to a single column
        ((GridLayout) super.getFieldEditorParent().getLayout()).numColumns = 1;
    }
	
    /**
     * Returns a parent composite for a field editor.
     * <p>
     * This value must not be cached since a new parent may be created each time this method called. Thus this method
     * must be called each time a field editor is constructed.
     * </p>
     * @return a parent
     */
    protected Composite getFieldEditorParent()
    {
        if (folder == null || folder.getItemCount() == 0)
        {
            return super.getFieldEditorParent();
        }
        return (Composite) folder.getItem(folder.getItemCount() - 1).getControl();
    }

    /**
     * Adds a tab to the page.
     * @param text the tab label
     */
    public void addTab(String text)
    {
        if (folder == null)
        {
            // initialize tab folder
            folder = new TabFolder(super.getFieldEditorParent(), SWT.NONE);
            folder.setLayoutData(new GridData(GridData.FILL_BOTH));
        }

        TabItem item = new TabItem(folder, SWT.NONE);
        item.setText(text);

        Composite currentTab = new Composite(folder, SWT.NULL);
        GridLayout layout = new GridLayout();
        currentTab.setLayout(layout);
        currentTab.setFont(super.getFieldEditorParent().getFont());
        currentTab.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        item.setControl(currentTab);
    }
	
	/**
	 * Version of Direction Field Editor that doesn't trigger an error if the directory is set to the default value.
	 * Used to prevent eclipse from complaining/forcing the changing of settings the user hasn't changed and may not care about.
	 */
	private static class NoCheckDefaultDirectoryFieldEditor extends DirectoryFieldEditor
	{
		public NoCheckDefaultDirectoryFieldEditor(String name, String labelText, Composite parent) {
			super(name, labelText, parent);
		}
		
		@Override
		protected boolean checkState() {
			final String value = this.getTextControl().getText();
			return super.checkState() || value.equals(Activator.getDefault().getPreferenceStore().getDefaultString(this.getPreferenceName())) || Utils.isPathValid(value);
		}
	}
}