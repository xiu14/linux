.class Lcom/google/android/material/appbar/AppBarLayout$1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lm0/w;


# instance fields
.field public final synthetic h:Lcom/google/android/material/appbar/AppBarLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/appbar/AppBarLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$1;->h:Lcom/google/android/material/appbar/AppBarLayout;

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
.method public final e(Landroid/view/View;Lm0/c2;)Lm0/c2;
    .locals 2

    .line 1
    sget-object p1, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$1;->h:Lcom/google/android/material/appbar/AppBarLayout;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    iget-object v1, p1, Lcom/google/android/material/appbar/AppBarLayout;->n:Lm0/c2;

    .line 15
    .line 16
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    iput-object v0, p1, Lcom/google/android/material/appbar/AppBarLayout;->n:Lm0/c2;

    .line 23
    .line 24
    iget-object v0, p1, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-lez v0, :cond_1

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    :goto_1
    xor-int/2addr v0, v1

    .line 39
    invoke-virtual {p1, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-object p2
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
