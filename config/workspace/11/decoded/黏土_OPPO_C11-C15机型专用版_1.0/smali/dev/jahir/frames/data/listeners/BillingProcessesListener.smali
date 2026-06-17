.class public interface abstract Ldev/jahir/frames/data/listeners/BillingProcessesListener;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/frames/data/listeners/BillingProcessesListener$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract onBillingClientDisconnected()V
.end method

.method public abstract onBillingClientReady()V
.end method

.method public abstract onInAppProductDetailsListUpdated(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lp3/l;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onInAppPurchasesHistoryUpdated(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/DetailedPurchaseRecord;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onInAppSkuDetailsListUpdated(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lp3/l;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onProductPurchaseError(Ldev/jahir/frames/data/models/DetailedPurchaseRecord;)V
.end method

.method public abstract onProductPurchaseSuccess(Ldev/jahir/frames/data/models/DetailedPurchaseRecord;)V
.end method

.method public abstract onSkuPurchaseError(Ldev/jahir/frames/data/models/DetailedPurchaseRecord;)V
.end method

.method public abstract onSkuPurchaseSuccess(Ldev/jahir/frames/data/models/DetailedPurchaseRecord;)V
.end method

.method public abstract onSubscriptionsProductDetailsListUpdated(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lp3/l;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onSubscriptionsPurchasesHistoryUpdated(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/DetailedPurchaseRecord;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onSubscriptionsSkuDetailsListUpdated(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lp3/l;",
            ">;)V"
        }
    .end annotation
.end method
