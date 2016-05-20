package id.co.veritrans.sdk.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import id.co.veritrans.sdk.R;
import id.co.veritrans.sdk.models.TransactionResponse;
import id.co.veritrans.sdk.utilities.Utils;

/**
 * Displays status information about bank transfer's api call .
 *
 * Created by shivam on 10/27/15.
 */
public class IndomaretPaymentFragment extends Fragment {

    public static final String KEY_ARG = "arg";
    public static final String VALID_UNTILL = "Valid Untill : ";
    private TransactionResponse transactionResponse;

    //views

    private TextView mTextViewValidity = null;
    private TextView mTextViewPaymentCode = null;


    public static IndomaretPaymentFragment newInstance(TransactionResponse mTransactionResponse) {
        IndomaretPaymentFragment fragment = new IndomaretPaymentFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(KEY_ARG, mTransactionResponse);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_indomaret_transfer_payment, container, false);
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        initializeViews(view);
    }


    /**
     * initializes view and adds click listener for it.
     *
     * @param view  view that needed to be initialized
     */
    private void initializeViews(View view) {
        mTextViewValidity = (TextView) view.findViewById(R.id.text_validaty);
        mTextViewPaymentCode = (TextView) view.findViewById(R.id.text_payment_code);

        if (transactionResponse != null) {
            if (transactionResponse.getStatusCode().trim().equalsIgnoreCase(getString(R.string.success_code_200))
                    || transactionResponse.getStatusCode().trim().equalsIgnoreCase(getString(R.string.success_code_201))) {
                mTextViewValidity.setText(VALID_UNTILL + Utils.getValidityTime(transactionResponse.getTransactionTime()));
            }
            if (transactionResponse.getPaymentCodeIndomaret() != null)
                mTextViewPaymentCode.setText(transactionResponse.getPaymentCodeIndomaret());

        }
    }
}