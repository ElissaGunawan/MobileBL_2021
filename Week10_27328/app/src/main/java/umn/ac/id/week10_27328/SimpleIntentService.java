package umn.ac.id.week10_27328;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class SimpleIntentService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public SimpleIntentService() {
        super("SimpleIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i("INTENTSERVICE", "onHandleIntent: IntentService dimulai !");
        int n =(int)(Math.random()*50)+10;
        try {
            for(int i = 0; i < n; i++) {
                Thread.sleep(200);
                Log.i("INTENTSERVICE", "onHandleIntent: berjalan "+
                        ((int)((100 * i)/(float) n)) + " persen");
            }
            Log.i("INTENTSERVICE", "onHandleIntent: Selesai");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}