/*
* 
*/
package digital.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import digital.diagram.part.DigitalVisualIDRegistry;

/**
 * @generated
 */
public class DigitalNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 4002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof DigitalNavigatorItem) {
			DigitalNavigatorItem item = (DigitalNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return DigitalVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
