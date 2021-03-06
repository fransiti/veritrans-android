package com.midtrans.sdk.uikit.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

import com.midtrans.sdk.corekit.core.MidtransSDK;

/**
 * @author rakawm
 */
public class SemiBoldTextView extends TextView {

    public SemiBoldTextView(Context context) {
        super(context);
        init();
    }

    public SemiBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SemiBoldTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public SemiBoldTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        MidtransSDK paymentSdk = MidtransSDK.getInstance();
        if (paymentSdk != null) {
            if (paymentSdk.getSemiBoldText() != null) {
                Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), paymentSdk.getSemiBoldText());
                if (typeface != null) {
                    setTypeface(typeface);
                }
            }
        }
    }
}
