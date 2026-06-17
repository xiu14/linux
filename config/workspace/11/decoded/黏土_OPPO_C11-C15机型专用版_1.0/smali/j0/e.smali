.class public final Lj0/e;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ll0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lj0/e;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lj0/e;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lj0/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lp3/e;

    .line 7
    .line 8
    new-instance v0, Lp3/r;

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, Lp3/r;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lj0/e;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ldev/jahir/frames/data/viewmodels/a;

    .line 26
    .line 27
    invoke-virtual {v1, p1, v0}, Ldev/jahir/frames/data/viewmodels/a;->a(Lp3/e;Lp3/r;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_0
    check-cast p1, Lj0/f;

    .line 32
    .line 33
    sget-object v0, Lj0/g;->c:Ljava/lang/Object;

    .line 34
    .line 35
    monitor-enter v0

    .line 36
    :try_start_0
    sget-object v1, Lj0/g;->d:Lq/k;

    .line 37
    .line 38
    iget-object v2, p0, Lj0/e;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ljava/util/ArrayList;

    .line 47
    .line 48
    if-nez v2, :cond_0

    .line 49
    .line 50
    monitor-exit v0

    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_2

    .line 54
    :cond_0
    iget-object v3, p0, Lj0/e;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v3, Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v1, v3}, Lq/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    const/4 v0, 0x0

    .line 63
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-ge v0, v1, :cond_1

    .line 68
    .line 69
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Ll0/a;

    .line 74
    .line 75
    invoke-interface {v1, p1}, Ll0/a;->accept(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    add-int/lit8 v0, v0, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    :goto_1
    return-void

    .line 82
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    throw p1

    .line 84
    :pswitch_1
    check-cast p1, Lj0/f;

    .line 85
    .line 86
    if-nez p1, :cond_2

    .line 87
    .line 88
    new-instance p1, Lj0/f;

    .line 89
    .line 90
    const/4 v0, -0x3

    .line 91
    invoke-direct {p1, v0}, Lj0/f;-><init>(I)V

    .line 92
    .line 93
    .line 94
    :cond_2
    iget-object v0, p0, Lj0/e;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lu2/c;

    .line 97
    .line 98
    invoke-virtual {v0, p1}, Lu2/c;->h(Lj0/f;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
