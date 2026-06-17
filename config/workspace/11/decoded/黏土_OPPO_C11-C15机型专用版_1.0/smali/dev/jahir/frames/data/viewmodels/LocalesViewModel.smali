.class public final Ldev/jahir/frames/data/viewmodels/LocalesViewModel;
.super Landroidx/lifecycle/a;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field private final localesData$delegate:Lp4/c;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    .line 1
    const-string v0, "application"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/lifecycle/a;-><init>(Landroid/app/Application;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Ldev/jahir/frames/data/viewmodels/LocalesViewModel$special$$inlined$lazyMutableLiveData$1;->INSTANCE:Ldev/jahir/frames/data/viewmodels/LocalesViewModel$special$$inlined$lazyMutableLiveData$1;

    .line 10
    .line 11
    invoke-static {p1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Ldev/jahir/frames/data/viewmodels/LocalesViewModel;->localesData$delegate:Lp4/c;

    .line 16
    .line 17
    return-void
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

.method public static final synthetic access$getLocalesData(Ldev/jahir/frames/data/viewmodels/LocalesViewModel;)Landroidx/lifecycle/i0;
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/LocalesViewModel;->getLocalesData()Landroidx/lifecycle/i0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
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

.method public static final synthetic access$internalLoadAppLocales(Ldev/jahir/frames/data/viewmodels/LocalesViewModel;Lt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldev/jahir/frames/data/viewmodels/LocalesViewModel;->internalLoadAppLocales(Lt4/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method private final getLocalesData()Landroidx/lifecycle/i0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/i0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/viewmodels/LocalesViewModel;->localesData$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/lifecycle/i0;

    .line 8
    .line 9
    return-object v0
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
.end method

.method private final internalLoadAppLocales(Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/c<",
            "-",
            "Lp4/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/LocalesViewModel$internalLoadAppLocales$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Ldev/jahir/frames/data/viewmodels/LocalesViewModel$internalLoadAppLocales$2;-><init>(Ldev/jahir/frames/data/viewmodels/LocalesViewModel;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v0, Lu4/a;->h:Lu4/a;

    .line 16
    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lp4/k;->a:Lp4/k;

    .line 21
    .line 22
    return-object p1
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
.method public final getLocales()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/viewmodels/ReadableLocale;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/LocalesViewModel;->getLocalesData()Landroidx/lifecycle/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/lifecycle/f0;->d()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/List;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lq4/r;->h:Lq4/r;

    .line 14
    .line 15
    :cond_0
    return-object v0
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
.end method

.method public final loadAppLocales()V
    .locals 4

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/t0;->g(Landroidx/lifecycle/z0;)Lk1/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/LocalesViewModel$loadAppLocales$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Ldev/jahir/frames/data/viewmodels/LocalesViewModel$loadAppLocales$1;-><init>(Ldev/jahir/frames/data/viewmodels/LocalesViewModel;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, v3}, Ln5/x;->p(Ln5/v;Lt4/h;Ln5/w;Ld5/p;I)Ln5/a0;

    .line 13
    .line 14
    .line 15
    return-void
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
.end method
