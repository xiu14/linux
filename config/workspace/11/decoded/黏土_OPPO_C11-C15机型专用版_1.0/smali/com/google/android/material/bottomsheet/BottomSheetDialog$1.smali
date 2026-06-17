.class Lcom/google/android/material/bottomsheet/BottomSheetDialog$1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lm0/w;


# instance fields
.field public final synthetic h:Lcom/google/android/material/bottomsheet/BottomSheetDialog;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$1;->h:Lcom/google/android/material/bottomsheet/BottomSheetDialog;

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
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$1;->h:Lcom/google/android/material/bottomsheet/BottomSheetDialog;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->t:Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p1, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->m:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e0:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    new-instance v0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;

    .line 15
    .line 16
    iget-object v1, p1, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->p:Landroid/widget/FrameLayout;

    .line 17
    .line 18
    invoke-direct {v0, v1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;-><init>(Landroid/view/View;Lm0/c2;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p1, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->t:Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->b(Landroid/view/Window;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p1, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->m:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 31
    .line 32
    iget-object p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->t:Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e0:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_1
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
