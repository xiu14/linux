.class public abstract Lu0/a;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final a:I

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lu0/c;->pooling_container_listener_holder_tag:I

    .line 2
    .line 3
    sput v0, Lu0/a;->a:I

    .line 4
    .line 5
    sget v0, Lu0/c;->is_pooling_container_tag:I

    .line 6
    .line 7
    sput v0, Lu0/a;->b:I

    .line 8
    .line 9
    return-void
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

.method public static final a(Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm0/c1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Lm0/c1;-><init>(Landroid/view/View;Lt4/c;)V

    .line 10
    .line 11
    .line 12
    new-instance p0, Lk5/i;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0, p0}, Lv4/a;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lk5/i;->k:Lt4/c;

    .line 22
    .line 23
    :goto_0
    invoke-virtual {p0}, Lk5/i;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lk5/i;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/view/View;

    .line 34
    .line 35
    sget v1, Lu0/a;->a:I

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lu0/b;

    .line 42
    .line 43
    if-nez v2, :cond_0

    .line 44
    .line 45
    new-instance v2, Lu0/b;

    .line 46
    .line 47
    invoke-direct {v2}, Lu0/b;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    iget-object v0, v2, Lu0/b;->a:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-static {v0}, Lq4/j;->e0(Ljava/util/List;)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    const/4 v2, -0x1

    .line 60
    if-lt v2, v1, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance p0, Ljava/lang/ClassCastException;

    .line 71
    .line 72
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 73
    .line 74
    .line 75
    throw p0

    .line 76
    :cond_2
    return-void
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method
