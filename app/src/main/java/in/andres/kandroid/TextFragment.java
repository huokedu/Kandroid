package in.andres.kandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Thomas Andres on 04.01.17.
 */

public class TextFragment extends Fragment {

    private static final String ARG_SECTION_NAME = "section_name";

    public TextFragment() {}

    public static TextFragment newInstance(String sectionName) {
        TextFragment fragment = new TextFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_NAME, sectionName);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_text, container, false);
//        TextView textView = (TextView) rootView.findViewById(R.id.fragmentTextView);
//        textView.setText(getArguments().getString(TextFragment.ARG_SECTION_NAME));
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        assert getView() != null : "TextFragment: getView() returned null";
        TextView textView = (TextView) getView().findViewById(R.id.fragmentTextView);
        textView.setText(getArguments().getString(TextFragment.ARG_SECTION_NAME));
    }
}
