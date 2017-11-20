package com.anandkparmar.designlibrary.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.anandkparmar.designlibrary.R;

/**
 * Created by anandparmar on 10/11/17.
 */

public class SelfToggleButton extends AppCompatButton {

    private Context context;
    boolean isSelected = false;

    private boolean isTogglable;
    private boolean defaultSelected;
    @ColorInt
    private int deselectedTextColor;
    @ColorInt
    private int deselectedBorderColor;
    @ColorInt
    private int selectedTextColor;
    @ColorInt
    private int selectedBackgroundColor;

    public SelfToggleButton(Context context) {
        super(context);
        initView(context, null);
    }

    public SelfToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs);
    }

    public SelfToggleButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);
    }

    private void initView(Context context, AttributeSet attrs) {
        this.context = context;
        TypedArray attrsArray = context.obtainStyledAttributes(attrs, R.styleable.SelfToggleButton);

        isTogglable = attrsArray.getBoolean(R.styleable.SelfToggleButton_is_togglable, true);
        defaultSelected = attrsArray.getBoolean(R.styleable.SelfToggleButton_default_selected, false);

        deselectedTextColor = attrsArray.getColor(R.styleable.SelfToggleButton_deselected_text_color, context.getResources().getColor(R.color.color_accent));
        deselectedBorderColor = attrsArray.getColor(R.styleable.SelfToggleButton_deselected_border_color, context.getResources().getColor(R.color.color_accent));
        selectedTextColor = attrsArray.getColor(R.styleable.SelfToggleButton_selected_text_color, context.getResources().getColor(R.color.color_text_primary_for_dark_background));
        selectedBackgroundColor = attrsArray.getColor(R.styleable.SelfToggleButton_selected_background_color, context.getResources().getColor(R.color.color_accent));

        setDeselectedView();
        if(defaultSelected){
            isSelected = true;
            setSelectedView();
        }
    }

    @Override
    public void setOnClickListener(@Nullable OnClickListener l) {
        super.setOnClickListener(l);
        if(isTogglable) {
            if (!isSelected) {
                isSelected = true;
                setSelectedView();
            } else {
                isSelected = false;
                setDeselectedView();
            }
        }
    }

    public void setDeselectedView(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            setBackground(context.getResources().getDrawable(R.drawable.self_toggle_button_drawable));
        }
        setTextColor(deselectedTextColor);

        GradientDrawable gradiantDrawable = (GradientDrawable) this.getBackground();
        gradiantDrawable.setStroke(4, deselectedBorderColor);
    }

    public void setSelectedView(){
        setTextColor(selectedTextColor);
        setBackgroundColor(selectedBackgroundColor);
    }

    @Override
    public boolean isSelected() {
        return isSelected;
    }

    @Override
    public void setSelected(boolean selected) {
        isSelected = selected;
    }

}
