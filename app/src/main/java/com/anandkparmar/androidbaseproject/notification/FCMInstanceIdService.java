package com.anandkparmar.androidbaseproject.notification;

import com.anandkparmar.utilitylibrary.utils.LogUtil;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by anandparmar on 20/11/17.
 */

public class FCMInstanceIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        String instanceToken = FirebaseInstanceId.getInstance().getToken();
        LogUtil.info(instanceToken);

        updateFCMInstanceIdToServer(instanceToken);
    }

    private void updateFCMInstanceIdToServer(String instanceToken) {
        //TODO - implement updateFCMInstanceId API
    }
}
