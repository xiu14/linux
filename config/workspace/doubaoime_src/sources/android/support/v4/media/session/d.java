package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.c;
import java.util.List;

/* loaded from: classes.dex */
class d<T extends c> extends MediaController.Callback {
    protected final T a;

    public d(T t) {
        this.a = t;
    }

    @Override // android.media.session.MediaController.Callback
    public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        int i;
        int i2;
        T t = this.a;
        int playbackType = playbackInfo.getPlaybackType();
        AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
        if ((audioAttributes.getFlags() & 1) == 1) {
            i2 = 7;
        } else {
            if ((audioAttributes.getFlags() & 4) != 4) {
                int usage = audioAttributes.getUsage();
                if (usage != 13) {
                    switch (usage) {
                        case 2:
                            i2 = 0;
                            break;
                        case 3:
                            i2 = 8;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i2 = 5;
                            break;
                        case 6:
                            i2 = 2;
                            break;
                        default:
                            i2 = 3;
                            break;
                    }
                } else {
                    i = 1;
                }
                ((MediaControllerCompat.a.C0003a) t).a(playbackType, i, playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
            }
            i2 = 6;
        }
        i = i2;
        ((MediaControllerCompat.a.C0003a) t).a(playbackType, i, playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
    }

    @Override // android.media.session.MediaController.Callback
    public void onExtrasChanged(Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((MediaControllerCompat.a.C0003a) this.a).b(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public void onMetadataChanged(MediaMetadata mediaMetadata) {
        ((MediaControllerCompat.a.C0003a) this.a).c(mediaMetadata);
    }

    @Override // android.media.session.MediaController.Callback
    public void onPlaybackStateChanged(PlaybackState playbackState) {
        ((MediaControllerCompat.a.C0003a) this.a).d(playbackState);
    }

    @Override // android.media.session.MediaController.Callback
    public void onQueueChanged(List<MediaSession.QueueItem> list) {
        ((MediaControllerCompat.a.C0003a) this.a).e(list);
    }

    @Override // android.media.session.MediaController.Callback
    public void onQueueTitleChanged(CharSequence charSequence) {
        ((MediaControllerCompat.a.C0003a) this.a).f(charSequence);
    }

    @Override // android.media.session.MediaController.Callback
    public void onSessionDestroyed() {
        ((MediaControllerCompat.a.C0003a) this.a).g();
    }

    @Override // android.media.session.MediaController.Callback
    public void onSessionEvent(String str, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((MediaControllerCompat.a.C0003a) this.a).h(str, bundle);
    }
}
