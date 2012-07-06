package net.jeeeyul.pdetools.shared;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class SWTExtensions {
	public <T extends Object> T init(T widget, Procedure1<T> initializer) {
		initializer.apply(widget);
		return widget;
	}

	public Button Checkbox(final Composite parent,
			final Procedure1<? super Button> initializer) {
		Button _button = new Button(parent, SWT.CHECK);
		Button label = _button;
		initializer.apply(label);
		return label;
	}

	public Link Link(final Composite parent,
			final Procedure1<? super Link> initializer) {
		Link _link = new Link(parent, SWT.CHECK);
		initializer.apply(_link);
		return _link;
	}

	public ToolBar ToolBar(final Composite parent,
			final Procedure1<? super ToolBar> initializer) {
		ToolBar toolBar = new ToolBar(parent, SWT.FLAT);
		initializer.apply(toolBar);
		return toolBar;
	}

	public ToolItem ToolItem(final ToolBar parent,
			final Procedure1<? super ToolItem> initializer) {
		ToolItem item = new ToolItem(parent, SWT.FLAT);
		initializer.apply(item);
		return item;
	}

	public Button RadioButton(final Composite parent,
			final Procedure1<? super Button> initializer) {
		Button _button = new Button(parent, SWT.RADIO);
		Button label = _button;
		initializer.apply(label);
		return label;
	}

	public CLabel CLabel(final Composite parent,
			final Procedure1<? super CLabel> initializer) {
		CLabel _label = new CLabel(parent, SWT.NORMAL);
		CLabel label = _label;
		initializer.apply(label);
		return label;
	}

	public Combo Combo(final Composite parent, int style,
			final Procedure1<? super Combo> initializer) {
		Combo combo = new Combo(parent, style);
		initializer.apply(combo);
		return combo;
	}

	public Composite Composite(final Composite parent,
			final Procedure1<? super Composite> initializer) {
		Composite _composite = new Composite(parent, SWT.NORMAL);
		Composite comp = _composite;
		initializer.apply(comp);
		return comp;
	}

	public Display display() {
		Display _default = Display.getDefault();
		return _default;
	}

	public GridData FILL_BOTH() {
		GridData _gridData = new GridData(GridData.FILL_BOTH);
		GridData gd = _gridData;
		return gd;
	}

	public GridData FILL_BOTH(final Procedure1<? super GridData> initializer) {
		GridData _gridData = new GridData(GridData.FILL_BOTH);
		GridData gd = _gridData;
		initializer.apply(gd);
		return gd;
	}

	public GridData FILL_HORIZONTAL() {
		GridData _gridData = new GridData(GridData.FILL_HORIZONTAL);
		GridData gd = _gridData;
		return gd;
	}

	public GridData FILL_HORIZONTAL(
			final Procedure1<? super GridData> initializer) {
		GridData _gridData = new GridData(GridData.FILL_HORIZONTAL);
		GridData gd = _gridData;
		initializer.apply(gd);
		return gd;
	}

	public ImageRegistry getImageRegistry() {
		ImageRegistry result = (ImageRegistry) Display.getDefault().getData(
				"imageRegistry");
		if (result == null) {
			result = new ImageRegistry();
			Display.getDefault().setData("imageRegistry", result);
		}
		return result;
	}

	public GridData GridData(final Procedure1<? super GridData> initializer) {
		GridData _gridData = new GridData();
		GridData gd = _gridData;
		initializer.apply(gd);
		return gd;
	}

	public GridLayout GridLayout() {
		return new GridLayout();
	}

	public GridLayout GridLayout(Procedure1<GridLayout> initializer) {
		GridLayout gridLayout = new GridLayout();
		initializer.apply(gridLayout);
		return gridLayout;
	}

	public Group Group(final Composite parent,
			final Procedure1<? super Group> initializer) {
		Group _group = new Group(parent, SWT.NORMAL);
		Group comp = _group;
		initializer.apply(comp);
		return comp;
	}

	public Label HorizontalSeperator(final Composite parent,
			final Procedure1<? super Label> initializer) {
		Label _label = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		Label label = _label;
		initializer.apply(label);
		return label;
	}

	public String htmlCode(RGB rgb) {
		return String.format("#%02x%02x%02x", rgb.red, rgb.green, rgb.blue);
	}

	public Label Label(final Composite parent,
			final Procedure1<? super Label> initializer) {
		Label _label = new Label(parent, SWT.NORMAL);
		Label label = _label;
		initializer.apply(label);
		return label;
	}

	public Composite newComposite(final Composite parent,
			final Procedure1<? super Composite> initializer) {
		Composite _composite = new Composite(parent, SWT.NORMAL);
		Composite comp = _composite;
		initializer.apply(comp);
		return comp;
	}

	public int operator_and(int e1, int e2) {
		return e1 & e2;
	}

	public int operator_or(int e1, int e2) {
		return e1 | e2;
	}

	public Text PasswordField(final Composite parent,
			final Procedure1<? super Text> initializer) {
		Text _text = new Text(parent, SWT.BORDER | SWT.PASSWORD);
		Text label = _text;
		initializer.apply(label);
		return label;
	}

	public Button PushButton(final Composite parent,
			final Procedure1<? super Button> initializer) {
		Button _button = new Button(parent, SWT.PUSH);
		Button label = _button;
		initializer.apply(label);
		return label;
	}

	public Text ReadOnlyTextField(final Composite parent,
			final Procedure1<? super Text> initializer) {
		Text _text = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		Text label = _text;
		initializer.apply(label);
		return label;
	}

	public TreeItem RootItem(Tree tree, final Procedure1<TreeItem> initializer) {
		TreeItem item = new TreeItem(tree, SWT.NORMAL);
		initializer.apply(item);
		return item;
	}

	/**
	 * 주어진 {@link Shell}을 기준으로 UI 루프를 운영합니다. 해당 {@link Shell}이 디스포즈 되기 전까지
	 * 운영됩니다.
	 * 
	 * @param UI
	 *            루프를 실행할 {@link Shell}.
	 * @since 2.0.0
	 */
	public void runLoop(final Shell s) {
		boolean _isDisposed = s.isDisposed();
		boolean _operator_not = BooleanExtensions.operator_not(_isDisposed);
		boolean _while = _operator_not;
		while (_while) {
			Display _display = this.display();
			boolean _readAndDispatch = _display.readAndDispatch();
			boolean _operator_not_1 = BooleanExtensions
					.operator_not(_readAndDispatch);
			if (_operator_not_1) {
				Display _display_1 = this.display();
				_display_1.sleep();
			}
			boolean _isDisposed_1 = s.isDisposed();
			boolean _operator_not_2 = BooleanExtensions
					.operator_not(_isDisposed_1);
			_while = _operator_not_2;
		}
	}

	public void schedule(final Procedure1<Display> p) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				p.apply(Display.getDefault());
			}
		});
	}

	public void setOnClick(final Button button,
			final Procedure1<Button> function) {
		button.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				function.apply(button);
			}
		});
	}

	public <T extends Widget> void setOnEvent(final T w, int eventType,
			final Procedure1<T> handler) {
		w.addListener(eventType, new Listener() {
			@Override
			public void handleEvent(Event event) {
				handler.apply(w);
			}
		});
	}

	public void setOnFocusOut(final Control control,
			final Procedure1<? super Control> handler) {
		control.addListener(SWT.FocusOut, new Listener() {
			@Override
			public void handleEvent(Event event) {
				handler.apply(control);
			}
		});
	}

	public void setOnFocus(final Control control,
			final Procedure1<? super Control> handler) {
		control.addListener(SWT.FocusIn, new Listener() {
			@Override
			public void handleEvent(Event event) {
				handler.apply(control);
			}
		});
	}

	public <T extends Widget> void setOnModified(final T w,
			final Procedure1<T> handler) {
		w.addListener(SWT.Modify, new Listener() {
			@Override
			public void handleEvent(Event event) {
				handler.apply(w);
			}
		});
	}

	public <T extends Widget> void setOnSelection(final T w,
			final Procedure1<T> handler) {
		w.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				handler.apply(w);
			}
		});
	}

	public Shell Shell(final Procedure1<? super Shell> initializer) {
		Shell _shell = new Shell();
		Shell s = _shell;
		initializer.apply(s);
		return s;
	}

	public TreeItem SubItem(TreeItem parent,
			final Procedure1<TreeItem> initializer) {
		TreeItem item = new TreeItem(parent, SWT.NORMAL);
		initializer.apply(item);
		return item;
	}

	public Text TextArea(final Composite parent,
			final Procedure1<? super Text> initializer) {
		int _bitwiseOr = IntegerExtensions.bitwiseOr(SWT.MULTI, SWT.BORDER);
		Text _text = new Text(parent, _bitwiseOr);
		Text label = _text;
		initializer.apply(label);
		return label;
	}

	public Text TextField(final Composite parent, int style,
			final Procedure1<? super Text> initializer) {
		Text _text = new Text(parent, style);
		Text label = _text;
		initializer.apply(label);
		return label;
	}

	public Text TextField(final Composite parent,
			final Procedure1<? super Text> initializer) {
		Text _text = new Text(parent, SWT.BORDER);
		Text label = _text;
		initializer.apply(label);
		return label;
	}

	public Text SearchField(final Composite parent,
			final Procedure1<? super Text> initializer) {
		Text _text = new Text(parent, SWT.BORDER | SWT.SEARCH);
		Text label = _text;
		initializer.apply(label);
		return label;
	}

	public Tree Tree(Composite parent, final Procedure1<Tree> initializer) {
		Tree tree = new Tree(parent, SWT.BORDER);
		initializer.apply(tree);
		return tree;
	}

	public Label VerticalSeperator(final Composite parent,
			final Procedure1<? super Label> initializer) {
		Label _label = new Label(parent, SWT.SEPARATOR | SWT.VERTICAL);
		Label label = _label;
		initializer.apply(label);
		return label;
	}
}
