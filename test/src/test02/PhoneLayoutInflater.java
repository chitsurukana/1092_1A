package test02;

import javax.swing.text.View;

//2.8 p.37
public class PhoneLayoutInflater extends LayoutInflater{
	//����View�������e��A�pTextView��������|�Oandroid.widget.TextView
	private static final String[] sClassPrefixList = {
			"android.widget.",
			"android.webkit."
	};
	
	//�{���X�ٲ�
	@Override protected View onCreateView(String name, AttributeSet attrs)throws ClassNotFoundException{
		// �bView�W�٪��e���K�[�e��ӫغcView��������|�A�Ҧp�A���O�W��TextView�A����TextView
		// ������|�Oandroid.widget.TextView
		for(String prefix : sClassPrefixList) {
			try {
				View view = createView(name, prefix, attrs);
				if(view != null) {
					return view;
				}
			}catch(ClassNotFoundException e) {
				//�ٲ�
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
//		//1.��mContentParent���Ůɥ��ظmDrcorView
//		//�åB�NDrcorView�]�q��mContentParent��
//		if(mContentParent == null) {
//			installDecor();
//		}else {
//			mContentParent.removeAllViews();
//		}
//		//2.�ѪRlayoutResID
//		mLayoutInflater.inflate(layoutResID, mContentParent);
//	//�{���X�ٲ�
//	}
	
//	//2.8 p.39
//	public View inflate(int resource, ViewGroup root) {
//		//root�����šA�h�|�qresource�G���ѪR��View�A�òK�[��root��
//		return inflate(resource, root, root != null);
//	}
//	
//	public View inflate(int resource, ViewGroup root, boolean attachToRoot) {
//		//���xml�귽�ѪR��
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









