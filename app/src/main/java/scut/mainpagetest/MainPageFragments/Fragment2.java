/**
 * 
 */
package scut.mainpagetest.MainPageFragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import scut.mainpagetest.R;

/**
 * @author lili.guo
 * 
 *         2014-10-22
 */
public class Fragment2 extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.mainpage_fragment_item2, null);
		return view;
	}
}
