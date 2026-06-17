.class public final Lcom/google/android/gms/dynamic/SupportFragmentWrapper;
.super Lcom/google/android/gms/dynamic/IFragmentWrapper$Stub;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation


# instance fields
.field public final c:Landroidx/fragment/app/l0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/l0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/dynamic/IFragmentWrapper$Stub;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

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
.method public final D(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->l(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroidx/fragment/app/l0;->unregisterForContextMenu(Landroid/view/View;)V

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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final F()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->isResumed()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final H()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->isDetached()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final J()Lcom/google/android/gms/dynamic/ObjectWrapper;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->getView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/google/android/gms/dynamic/ObjectWrapper;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v1
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

.method public final K(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/fragment/app/l0;->setRetainInstance(Z)V

    .line 4
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

.method public final Q(Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/fragment/app/l0;->startActivity(Landroid/content/Intent;)V

    .line 4
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

.method public final U()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->isHidden()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final V(Landroid/content/Intent;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/fragment/app/l0;->startActivityForResult(Landroid/content/Intent;I)V

    .line 4
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

.method public final Y()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->getRetainInstance()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->getTargetRequestCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final b0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/fragment/app/l0;->setUserVisibleHint(Z)V

    .line 4
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

.method public final c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->getId()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final d()Lcom/google/android/gms/dynamic/IFragmentWrapper;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->getParentFragment()Landroidx/fragment/app/l0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;-><init>(Landroidx/fragment/app/l0;)V

    .line 12
    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return-object v0
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

.method public final f()Lcom/google/android/gms/dynamic/ObjectWrapper;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/google/android/gms/dynamic/ObjectWrapper;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v1
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

.method public final g()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->getArguments()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public final i0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->isInLayout()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->getTag()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public final k()Lcom/google/android/gms/dynamic/IFragmentWrapper;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->getTargetFragment()Landroidx/fragment/app/l0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;-><init>(Landroidx/fragment/app/l0;)V

    .line 12
    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return-object v0
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

.method public final l0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->isVisible()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final m()Lcom/google/android/gms/dynamic/ObjectWrapper;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/google/android/gms/dynamic/ObjectWrapper;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v1
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

.method public final n0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->getUserVisibleHint()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final o(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/fragment/app/l0;->setHasOptionsMenu(Z)V

    .line 4
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

.method public final t()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->isRemoving()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final u(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->l(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroidx/fragment/app/l0;->registerForContextMenu(Landroid/view/View;)V

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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final x(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/fragment/app/l0;->setMenuVisibility(Z)V

    .line 4
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

.method public final y()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/SupportFragmentWrapper;->c:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->isAdded()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method
