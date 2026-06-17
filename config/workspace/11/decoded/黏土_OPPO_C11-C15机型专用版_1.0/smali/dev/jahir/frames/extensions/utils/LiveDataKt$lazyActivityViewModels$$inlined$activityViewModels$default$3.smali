.class public final Ldev/jahir/frames/extensions/utils/LiveDataKt$lazyActivityViewModels$$inlined$activityViewModels$default$3;
.super Lkotlin/jvm/internal/k;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldev/jahir/frames/extensions/utils/LiveDataKt;->lazyActivityViewModels(Landroidx/fragment/app/l0;Ld5/a;)Lp4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Ld5/a;"
    }
.end annotation


# instance fields
.field final synthetic $this_activityViewModels:Landroidx/fragment/app/l0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/l0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldev/jahir/frames/extensions/utils/LiveDataKt$lazyActivityViewModels$$inlined$activityViewModels$default$3;->$this_activityViewModels:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/k;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public final invoke()Landroidx/lifecycle/c1;
    .locals 1

    .line 2
    iget-object v0, p0, Ldev/jahir/frames/extensions/utils/LiveDataKt$lazyActivityViewModels$$inlined$activityViewModels$default$3;->$this_activityViewModels:Landroidx/fragment/app/l0;

    invoke-virtual {v0}, Landroidx/fragment/app/l0;->requireActivity()Landroidx/fragment/app/q0;

    move-result-object v0

    invoke-virtual {v0}, Lb/q;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/c1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/extensions/utils/LiveDataKt$lazyActivityViewModels$$inlined$activityViewModels$default$3;->invoke()Landroidx/lifecycle/c1;

    move-result-object v0

    return-object v0
.end method
