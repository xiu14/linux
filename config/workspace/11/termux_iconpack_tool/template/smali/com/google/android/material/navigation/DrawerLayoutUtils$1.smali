.class Lcom/google/android/material/navigation/DrawerLayoutUtils$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final synthetic a:Landroidx/drawerlayout/widget/DrawerLayout;

.field public final synthetic b:Lcom/google/android/material/navigation/NavigationView;


# direct methods
.method public constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;Lcom/google/android/material/navigation/NavigationView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/navigation/DrawerLayoutUtils$1;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/material/navigation/DrawerLayoutUtils$1;->b:Lcom/google/android/material/navigation/NavigationView;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/material/navigation/DrawerLayoutUtils$1;->b:Lcom/google/android/material/navigation/NavigationView;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Lcom/google/android/material/navigation/DrawerLayoutUtils$1;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 5
    .line 6
    invoke-virtual {v1, p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->c(Landroid/view/View;Z)V

    .line 7
    .line 8
    .line 9
    const/high16 p1, -0x67000000

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->setScrimColor(I)V

    .line 12
    .line 13
    .line 14
    return-void
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
