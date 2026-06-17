.class public final synthetic Landroidx/fragment/app/f2;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Landroidx/fragment/app/s;

.field public final synthetic j:Landroidx/fragment/app/h2;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/s;Landroidx/fragment/app/h2;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/fragment/app/f2;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/fragment/app/f2;->i:Landroidx/fragment/app/s;

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/fragment/app/f2;->j:Landroidx/fragment/app/h2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/fragment/app/f2;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/fragment/app/f2;->i:Landroidx/fragment/app/s;

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v2, p0, Landroidx/fragment/app/f2;->j:Landroidx/fragment/app/h2;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Landroidx/fragment/app/s;->c:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    const-string v0, "this$0"

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/fragment/app/f2;->i:Landroidx/fragment/app/s;

    .line 24
    .line 25
    invoke-static {v1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "$operation"

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/fragment/app/f2;->j:Landroidx/fragment/app/h2;

    .line 31
    .line 32
    invoke-static {v2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroidx/fragment/app/s;->a(Landroidx/fragment/app/h2;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_1
    iget-object v0, p0, Landroidx/fragment/app/f2;->i:Landroidx/fragment/app/s;

    .line 40
    .line 41
    iget-object v1, v0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    .line 42
    .line 43
    iget-object v2, p0, Landroidx/fragment/app/f2;->j:Landroidx/fragment/app/h2;

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    iget v1, v2, Landroidx/fragment/app/h2;->a:I

    .line 52
    .line 53
    iget-object v2, v2, Landroidx/fragment/app/h2;->c:Landroidx/fragment/app/l0;

    .line 54
    .line 55
    iget-object v2, v2, Landroidx/fragment/app/l0;->mView:Landroid/view/View;

    .line 56
    .line 57
    const-string v3, "operation.fragment.mView"

    .line 58
    .line 59
    invoke-static {v2, v3}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, v0, Landroidx/fragment/app/s;->a:Landroid/view/ViewGroup;

    .line 63
    .line 64
    invoke-static {v1, v2, v0}, Landroidx/appcompat/app/b;->d(ILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
