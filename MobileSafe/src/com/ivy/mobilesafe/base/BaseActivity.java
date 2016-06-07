package com.ivy.mobilesafe.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Activity的基类
 */
public abstract class BaseActivity extends Activity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initView();
		initLinstener();
		initData();
	}

	public abstract void initView();
	public abstract void initLinstener();
	public abstract void initData();
	public abstract void processClick(View v);

	@Override
	public void onClick(View v) {
		processClick(v);
	}
}
