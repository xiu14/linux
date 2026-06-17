.class public final Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel$loadCategoriesFromIconPack$2$invokeSuspend$lambda$3$$inlined$sortedBy$1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel$loadCategoriesFromIconPack$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;


# direct methods
.method public constructor <init>(Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel$loadCategoriesFromIconPack$2$invokeSuspend$lambda$3$$inlined$sortedBy$1;->this$0:Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 1
    check-cast p1, Ldev/jahir/blueprint/data/models/Icon;

    .line 2
    .line 3
    iget-object v0, p0, Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel$loadCategoriesFromIconPack$2$invokeSuspend$lambda$3$$inlined$sortedBy$1;->this$0:Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;

    .line 4
    .line 5
    invoke-static {v0}, Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;->access$getShouldSortIcons(Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ldev/jahir/blueprint/data/models/Icon;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, v1

    .line 18
    :goto_0
    check-cast p2, Ldev/jahir/blueprint/data/models/Icon;

    .line 19
    .line 20
    iget-object v0, p0, Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel$loadCategoriesFromIconPack$2$invokeSuspend$lambda$3$$inlined$sortedBy$1;->this$0:Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;

    .line 21
    .line 22
    invoke-static {v0}, Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;->access$getShouldSortIcons(Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p2}, Ldev/jahir/blueprint/data/models/Icon;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_1
    invoke-static {p1, v1}, La/a;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1
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
