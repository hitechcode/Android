package lib.listview.custom.com.customlistviewlibrary;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.GridLayout.LayoutParams;

public class CustomListView {

        private Context _context = null;
        private String[] _titles = null;
        private String[] _subTitles = null;
        private Integer[] _icons = null;
        private Activity _activity = null;
        private ListView list = null;

        public CustomListView(Context context){
            _context = context;
            _activity = (Activity)_context;
        }

        public void setAttributes(Integer[] icons, String[] titles,String[] subTitles) {
            _titles = titles;
            _subTitles = subTitles;
            _icons = icons;

            if (_titles != null && _titles != null && _subTitles != null) {

                if (_context != null) {

                    CustomListAdapter adapter = new CustomListAdapter((Activity) _context, titles, icons);
                    RelativeLayout relativeLayout_529 = new RelativeLayout(_context);
                    LayoutParams layout_997 = new LayoutParams();
                    layout_997.width = ViewGroup.LayoutParams.MATCH_PARENT;
                    layout_997.height = ViewGroup.LayoutParams.MATCH_PARENT;
                    relativeLayout_529.setLayoutParams(layout_997);

                    list = new ListView(_context);
                    list.setId(R.id.list);
                    ViewGroup.LayoutParams layout_237 = new LayoutParams();
                    layout_237.width = LayoutParams.FILL_PARENT;
                    layout_237.height = LayoutParams.FILL_PARENT;
                    list.setLayoutParams(layout_237);
                    relativeLayout_529.addView(list);
                    _activity.setContentView(relativeLayout_529,layout_997);
                    list.setAdapter(adapter);
                }
            }
        }

        public ListView getListView(){
            if(list != null){
                return list;
            }
            return  null;
        }
}
