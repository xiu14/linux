.class public interface abstract Ldev/jahir/frames/data/network/DownloadListenerThread$DownloadListener;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldev/jahir/frames/data/network/DownloadListenerThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "DownloadListener"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/frames/data/network/DownloadListenerThread$DownloadListener$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract onFailure(Ljava/lang/Exception;)V
.end method

.method public abstract onProgress(I)V
.end method

.method public abstract onSuccess(Ljava/lang/String;)V
.end method
