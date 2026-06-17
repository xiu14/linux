.class final Ldev/jahir/blueprint/ui/adapters/HelpAdapter$DiffCallback;
.super Landroidx/recyclerview/widget/v;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldev/jahir/blueprint/ui/adapters/HelpAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DiffCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/v;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Ldev/jahir/blueprint/ui/adapters/HelpAdapter$DiffCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/blueprint/ui/adapters/HelpAdapter$DiffCallback;

    .line 2
    .line 3
    invoke-direct {v0}, Ldev/jahir/blueprint/ui/adapters/HelpAdapter$DiffCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldev/jahir/blueprint/ui/adapters/HelpAdapter$DiffCallback;->INSTANCE:Ldev/jahir/blueprint/ui/adapters/HelpAdapter$DiffCallback;

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
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
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
.end method


# virtual methods
.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lp4/f;

    check-cast p2, Lp4/f;

    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/HelpAdapter$DiffCallback;->areContentsTheSame(Lp4/f;Lp4/f;)Z

    move-result p1

    return p1
.end method

.method public areContentsTheSame(Lp4/f;Lp4/f;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp4/f;",
            "Lp4/f;",
            ")Z"
        }
    .end annotation

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p1, Lp4/f;->h:Ljava/lang/Object;

    iget-object v1, p2, Lp4/f;->h:Ljava/lang/Object;

    .line 3
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object p1, p1, Lp4/f;->i:Ljava/lang/Object;

    iget-object p2, p2, Lp4/f;->i:Ljava/lang/Object;

    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lp4/f;

    check-cast p2, Lp4/f;

    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/HelpAdapter$DiffCallback;->areItemsTheSame(Lp4/f;Lp4/f;)Z

    move-result p1

    return p1
.end method

.method public areItemsTheSame(Lp4/f;Lp4/f;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp4/f;",
            "Lp4/f;",
            ")Z"
        }
    .end annotation

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p1, Lp4/f;->h:Ljava/lang/Object;

    iget-object v1, p2, Lp4/f;->h:Ljava/lang/Object;

    .line 3
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object p1, p1, Lp4/f;->i:Ljava/lang/Object;

    iget-object p2, p2, Lp4/f;->i:Ljava/lang/Object;

    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
