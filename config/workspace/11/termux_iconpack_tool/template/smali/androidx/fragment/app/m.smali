.class public final synthetic Landroidx/fragment/app/m;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/c2;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    .line 2
    const/4 p1, 0x0

    iput p1, p0, Landroidx/fragment/app/m;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/fragment/app/m;->i:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/fragment/app/m;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/p;Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Landroidx/fragment/app/m;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/m;->i:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/fragment/app/m;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Landroidx/fragment/app/m;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/fragment/app/m;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/p;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/fragment/app/m;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    const-string v2, "$container"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Landroidx/fragment/app/p;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    check-cast v4, Landroidx/fragment/app/q;

    .line 35
    .line 36
    iget-object v4, v4, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/h2;

    .line 37
    .line 38
    iget-object v5, v4, Landroidx/fragment/app/h2;->c:Landroidx/fragment/app/l0;

    .line 39
    .line 40
    invoke-virtual {v5}, Landroidx/fragment/app/l0;->getView()Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    if-eqz v5, :cond_0

    .line 45
    .line 46
    iget v4, v4, Landroidx/fragment/app/h2;->a:I

    .line 47
    .line 48
    invoke-static {v4, v5, v1}, Landroidx/appcompat/app/b;->d(ILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    return-void

    .line 53
    :pswitch_0
    iget-object v0, p0, Landroidx/fragment/app/m;->i:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Landroid/view/View;

    .line 56
    .line 57
    iget-object v1, p0, Landroidx/fragment/app/m;->j:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Landroid/graphics/Rect;

    .line 60
    .line 61
    invoke-static {v0, v1}, Landroidx/fragment/app/c2;->j(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method
