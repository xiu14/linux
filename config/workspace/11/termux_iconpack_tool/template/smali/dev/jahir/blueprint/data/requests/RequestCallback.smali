.class public interface abstract Ldev/jahir/blueprint/data/requests/RequestCallback;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/blueprint/data/requests/RequestCallback$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract onRequestEmailIntent(Landroid/content/Intent;)V
.end method

.method public abstract onRequestEmpty()V
.end method

.method public abstract onRequestError(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract onRequestLimited(Ldev/jahir/blueprint/data/requests/RequestState;Z)V
.end method

.method public abstract onRequestRunning()V
.end method

.method public abstract onRequestStarted()V
.end method

.method public abstract onRequestUploadFinished(Z)V
.end method
