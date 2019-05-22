package samantha.ciaramitaro.timerkotlinapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import samantha.ciaramitaro.timerkotlinapp.util.PrefUtil

class TimerExperiedReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        //TODO: show notification

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
