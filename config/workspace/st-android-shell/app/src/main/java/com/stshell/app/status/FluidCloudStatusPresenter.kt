package com.stshell.app.status

import android.util.Log

class FluidCloudStatusPresenter : StatusPresenter {
    override fun onBridgeReady(event: GenerationStatusEvent.BridgeReady) = Unit

    override fun onGenerationPending(session: GenerationSession) {
        Log.d("STFluidCloud", "TODO prepare fluid cloud: $session")
    }

    override fun onGenerationStarted(session: GenerationSession) {
        Log.d("STFluidCloud", "TODO create fluid cloud: $session")
    }

    override fun onGenerationContentStarted(session: GenerationSession) {
        Log.d("STFluidCloud", "TODO content fluid cloud: $session")
    }

    override fun onGenerationHeartbeat(session: GenerationSession) {
        Log.d("STFluidCloud", "TODO update fluid cloud: $session")
    }

    override fun onGenerationCompleted(session: GenerationSession, event: GenerationStatusEvent.Ended) {
        Log.d("STFluidCloud", "TODO complete fluid cloud: $session event=$event")
    }

    override fun onGenerationStopped(session: GenerationSession, event: GenerationStatusEvent.Stopped) {
        Log.d("STFluidCloud", "TODO stop fluid cloud: $session event=$event")
    }
}
