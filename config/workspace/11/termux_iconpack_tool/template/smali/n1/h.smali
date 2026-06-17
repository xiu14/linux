.class public final Ln1/h;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final f:Ln1/c;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;

.field public final c:Lq/f;

.field public final d:Landroid/util/SparseBooleanArray;

.field public final e:Ln1/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ln1/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ln1/h;->f:Ln1/c;

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

.method public constructor <init>(Ljava/util/List;Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln1/h;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Ln1/h;->b:Ljava/util/List;

    .line 7
    .line 8
    new-instance p2, Landroid/util/SparseBooleanArray;

    .line 9
    .line 10
    invoke-direct {p2}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Ln1/h;->d:Landroid/util/SparseBooleanArray;

    .line 14
    .line 15
    new-instance p2, Lq/f;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p2, v0}, Lq/k;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Ln1/h;->c:Lq/f;

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    const/high16 v1, -0x80000000

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    :goto_0
    if-ge v0, p2, :cond_1

    .line 31
    .line 32
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ln1/g;

    .line 37
    .line 38
    iget v4, v3, Ln1/g;->e:I

    .line 39
    .line 40
    if-le v4, v1, :cond_0

    .line 41
    .line 42
    move-object v2, v3

    .line 43
    move v1, v4

    .line 44
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iput-object v2, p0, Ln1/h;->e:Ln1/g;

    .line 48
    .line 49
    return-void
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
.method public final a(Ln1/i;)Ln1/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ln1/h;->c:Lq/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ln1/g;

    .line 8
    .line 9
    return-object p1
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
