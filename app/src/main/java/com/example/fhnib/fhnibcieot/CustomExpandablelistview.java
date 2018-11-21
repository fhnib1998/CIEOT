package com.example.fhnib.fhnibcieot;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class CustomExpandablelistview extends BaseExpandableListAdapter{
    private Context context;
    private List<String> listPart;
    private HashMap<String,List<String>> listExercise;

    public CustomExpandablelistview(Context context, List<String> listPart, HashMap<String, List<String>> listExercise) {
        this.context = context;
        this.listPart = listPart;
        this.listExercise = listExercise;
    }

    @Override
    public int getGroupCount() {
        return listPart.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listExercise.get(listPart.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listPart.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listExercise.get(listPart.get(groupPosition)).get(childPosition);
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
        String titlePart = (String) getGroup(groupPosition);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.custom_groupview,null);
        TextView textviewExercise = convertView.findViewById(R.id.textviewPart);
        textviewExercise.setText(titlePart);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String titleExercise = (String) getChild(groupPosition,childPosition);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.custom_childview,null);
        TextView textviewExercise = convertView.findViewById(R.id.textviewExercise);
        textviewExercise.setText(titleExercise);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
