package test02;

import javax.swing.text.View;

//2.8 p.37
public class PhoneLayoutInflater extends LayoutInflater{
	//內建View類型的前綴，如TextView的完整路徑是android.widget.TextView
	private static final String[] sClassPrefixList = {
			"android.widget.",
			"android.webkit."
	};
	
	//程式碼省略
	@Override protected View onCreateView(String name, AttributeSet attrs)throws ClassNotFoundException{
		// 在View名稱的前面添加前綴來建構View的完整路徑，例如，類別名為TextView，那麼TextView
		// 完整路徑是android.widget.TextView
		for(String prefix : sClassPrefixList) {
			try {
				View view = createView(name, prefix, attrs);
				if(view != null) {
					return view;
				}
			}catch(ClassNotFoundException e) {
				//省略
			}
		}
		return super.onCreatView(name, attrs);
	}
//	//2.8 p.38
//	public void setContentView(View view) {
//		getWindow().setContentView(view);
//		initActionBar();
//	}
	
	
//	@Override
//	public void setContentView(int layoutResID) {
//		//1.當mContentParent為空時先建置DrcorView
//		//並且將DrcorView包裹到mContentParent中
//		if(mContentParent == null) {
//			installDecor();
//		}else {
//			mContentParent.removeAllViews();
//		}
//		//2.解析layoutResID
//		mLayoutInflater.inflate(layoutResID, mContentParent);
//	//程式碼省略
//	}
	
//	//2.8 p.39
//	public View inflate(int resource, ViewGroup root) {
//		//root不為空，則會從resource佈局解析到View，並添加到root中
//		return inflate(resource, root, root != null);
//	}
//	
//	public View inflate(int resource, ViewGroup root, boolean attachToRoot) {
//		//獲取xml資源解析器
//		XmlResourceParser parser = getContext().getResources().getLayout(resource);
//		try {
//			return inflate(parser, root, attachToRoot);
//		}finally {
//			parser.close();
//		}
//	}
//	//
//	public View inflate(XmlPullParser parser, ViewGroup root, boolean attachToRoot) {
//		synchronized(mConstructorArgs) {
//			final AttributeSet attrs = Xml.asAttributeSet(parser);
//			Context lastContext = (Context)mConstructorArgs[0];
//			//
//			mConstructorArgs[0] = mContent;
//			//
//			View result = root;
//			try {
//				//
//				int type;
//				//
//				while((type = parser.next()) != XmlPullParser.START_TAG &&
//						type != XmlPullParser.END_DOCUMENT) {
//					//
//				}
//				//
//				final String name = parser.getName();
//				//
//				if(TAG_MERGE.equals(name)) {
//					rInflate(parser, root, attrs, flase);
//				}else {
//					//
//					View temp;
//					if(TAG_1995.equals(name)) {
//						temp = new BlinkLayout(mContent, attrs);
//					}else {
//						//
//						//
//						temp = createViewFromTag(root, name, attrs);
//					}
//					ViewGroup.LayoutParams params = null;
//					
//					if(root != null) {
//						//
//						params = root.generateLayoutParams(attrs);
//						//
//						if(!attachToRoot) {
//							temp.setLayoutParams(params);
//						}
//					}
//					//
//					rInflate(parser, temp, attrs, ture);
//					//
//					if(root != null && attachToRoot) {
//						root.addView(temp, params);
//					}
//					//
//					if(root == null || !attachToRoot) {
//						result = temp;
//					}
//				}
//			}
//			//
//			return result;
//		}
//	}
}









