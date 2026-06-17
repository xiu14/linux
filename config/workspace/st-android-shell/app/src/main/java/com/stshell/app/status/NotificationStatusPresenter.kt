package com.stshell.app.status

import android.content.Context

class NotificationStatusPresenter(
    private val context: Context,
) : StatusPresenter {
    override fun onBridgeReady(event: GenerationStatusEvent.BridgeReady) = Unit

    override fun onGenerationPending(session: GenerationSession) {
        GenerationLiveUpdateService.pending(context, "准备中", session.characterName)
    }

    override fun onGenerationStarted(session: GenerationSession) {
        GenerationLiveUpdateService.start(context, "在想了", session.characterName)
    }

    override fun onGenerationContentStarted(session: GenerationSession) {
        GenerationLiveUpdateService.contentStarted(context, "在写了", session.characterName)
    }

    override fun onGenerationHeartbeat(session: GenerationSession) {
        GenerationLiveUpdateService.heartbeat(context, "在写了", session.characterName)
    }

    override fun onGenerationCompleted(
        session: GenerationSession,
        event: GenerationStatusEvent.Ended,
    ) {
        GenerationLiveUpdateService.complete(context, "已完成", session.characterName ?: event.characterName)
    }

    override fun onGenerationStopped(
        session: GenerationSession,
        event: GenerationStatusEvent.Stopped,
    ) {
        GenerationLiveUpdateService.stop(context, "已中断", session.characterName ?: event.characterName)
    }
}
