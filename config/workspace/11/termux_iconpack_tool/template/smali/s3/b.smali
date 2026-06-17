.class public final synthetic Ls3/b;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ln1/f;


# instance fields
.field public final synthetic a:Lu2/i;


# direct methods
.method public synthetic constructor <init>(Lu2/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls3/b;->a:Lu2/i;

    .line 5
    .line 6
    return-void
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


# virtual methods
.method public final a([F)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    aget p1, p1, v0

    .line 3
    .line 4
    iget-object v1, p0, Ls3/b;->a:Lu2/i;

    .line 5
    .line 6
    iget-object v1, v1, Lu2/i;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ls3/c;

    .line 9
    .line 10
    iget-object v1, v1, Ls3/c;->a:[F

    .line 11
    .line 12
    aget v1, v1, v0

    .line 13
    .line 14
    sub-float/2addr p1, v1

    .line 15
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/high16 v1, 0x41200000    # 10.0f

    .line 20
    .line 21
    cmpl-float v1, p1, v1

    .line 22
    .line 23
    if-lez v1, :cond_0

    .line 24
    .line 25
    const/high16 v1, 0x43af0000    # 350.0f

    .line 26
    .line 27
    cmpg-float p1, p1, v1

    .line 28
    .line 29
    if-gez p1, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_0
    return v0
    .line 34
    .line 35
    .line 36
    .line 37
.end method
