package com.example.fhnib.fhnibcieot.CustomView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.fhnib.fhnibcieot.R;

import java.util.HashMap;
import java.util.List;

public class ExpandableListvab extends BaseExpandableListAdapter{
    private Context context;
    private List<String> list;
    private HashMap<String,List<String>> listVab;

    public ExpandableListvab(Context context, List<String> list, HashMap<String, List<String>> listVab) {
        this.context = context;
        this.list = list;
        this.listVab = listVab;
    }

    @Override
    public int getGroupCount() {
        return list.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listVab.get(list.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return list.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listVab.get(list.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String title = (String) getGroup(groupPosition);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.groupview_vab,null);
        TextView textviewExercise = convertView.findViewById(R.id.textviewList);
        textviewExercise.setText(title);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String titleVab = (String) getChild(groupPosition,childPosition);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.childview_vab,null);
        TextView textviewExercise = convertView.findViewById(R.id.textviewVab);
        textviewExercise.setText(titleVab);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
