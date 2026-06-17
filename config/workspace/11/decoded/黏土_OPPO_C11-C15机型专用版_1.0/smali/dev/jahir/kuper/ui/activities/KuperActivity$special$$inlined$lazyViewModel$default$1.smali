.class public final Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$1;
.super Lkotlin/jvm/internal/k;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldev/jahir/kuper/ui/activities/KuperActivity;-><init>()V
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
.field final synthetic $this_viewModels:Lb/q;


# direct methods
.method public constructor <init>(Lb/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$1;->$this_viewModels:Lb/q;

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

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$1;->$this_viewModels:Lb/q;

    invoke-virtual {v0}, Lb/q;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/c1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Ldev/jahir/kuper/ui/activities/KuperActivity$special$$inlined$lazyViewModel$default$1;->invoke()Landroidx/lifecycle/c1;

    move-result-object v0

    return-object v0
.end method
