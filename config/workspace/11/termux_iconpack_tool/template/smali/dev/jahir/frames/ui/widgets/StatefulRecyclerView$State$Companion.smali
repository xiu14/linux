.class public final Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getForValue$library_release(I)Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    sget-object p1, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->LOADING:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    sget-object p1, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->NORMAL:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_1
    sget-object p1, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->EMPTY:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 13
    .line 14
    return-object p1
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
