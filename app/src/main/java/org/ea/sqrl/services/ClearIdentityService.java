package org.ea.sqrl.services;

import android.app.job.JobParameters;
import android.app.job.JobService;

import org.ea.sqrl.processors.SQRLStorage;

public class ClearIdentityService extends JobService {
    public static final int JOB_NUMBER = 1;

    @Override
    public boolean onStartJob(JobParameters params) {
        SQRLStorage.getInstance().clearQuickPass(getApplicationContext());
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return SQRLStorage.getInstance().hasQuickPass();
    }
}
