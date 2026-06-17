.class public final synthetic Lb/n;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lb/n;->h:I

    iput-object p3, p0, Lb/n;->i:Ljava/lang/Object;

    iput p1, p0, Lb/n;->j:I

    iput-object p4, p0, Lb/n;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldev/jahir/frames/data/network/LocalDownloadListenerThread;Lkotlin/jvm/internal/n;I)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lb/n;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/n;->i:Ljava/lang/Object;

    iput-object p2, p0, Lb/n;->k:Ljava/lang/Object;

    iput p3, p0, Lb/n;->j:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lb/n;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb/n;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lo1/a;

    .line 9
    .line 10
    iget-object v1, p0, Lb/n;->k:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, v0, Lo1/a;->b:Lo1/c;

    .line 13
    .line 14
    iget v2, p0, Lb/n;->j:I

    .line 15
    .line 16
    invoke-interface {v0, v2, v1}, Lo1/c;->o(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lb/n;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ldev/jahir/frames/data/network/LocalDownloadListenerThread;

    .line 23
    .line 24
    iget-object v1, p0, Lb/n;->k:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lkotlin/jvm/internal/n;

    .line 27
    .line 28
    iget v2, p0, Lb/n;->j:I

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Ldev/jahir/frames/data/network/LocalDownloadListenerThread;->b(Ldev/jahir/frames/data/network/LocalDownloadListenerThread;Lkotlin/jvm/internal/n;I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    iget-object v0, p0, Lb/n;->i:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lb/o;

    .line 37
    .line 38
    iget-object v1, p0, Lb/n;->k:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Landroid/content/IntentSender$SendIntentException;

    .line 41
    .line 42
    new-instance v2, Landroid/content/Intent;

    .line 43
    .line 44
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v3, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-string v3, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    .line 54
    .line 55
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget v2, p0, Lb/n;->j:I

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-virtual {v0, v2, v3, v1}, Ld/h;->a(IILandroid/content/Intent;)Z

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_2
    iget-object v0, p0, Lb/n;->i:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lb/o;

    .line 69
    .line 70
    iget-object v1, p0, Lb/n;->k:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, La1/q;

    .line 73
    .line 74
    iget-object v1, v1, La1/q;->i:Ljava/lang/Object;

    .line 75
    .line 76
    iget-object v2, v0, Ld/h;->a:Ljava/util/LinkedHashMap;

    .line 77
    .line 78
    iget v3, p0, Lb/n;->j:I

    .line 79
    .line 80
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, Ljava/lang/String;

    .line 89
    .line 90
    if-nez v2, :cond_0

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_0
    iget-object v3, v0, Ld/h;->e:Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    check-cast v3, Ld/e;

    .line 100
    .line 101
    if-eqz v3, :cond_1

    .line 102
    .line 103
    iget-object v4, v3, Ld/e;->a:Ld/b;

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_1
    const/4 v4, 0x0

    .line 107
    :goto_0
    if-nez v4, :cond_2

    .line 108
    .line 109
    iget-object v3, v0, Ld/h;->g:Landroid/os/Bundle;

    .line 110
    .line 111
    invoke-virtual {v3, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget-object v0, v0, Ld/h;->f:Ljava/util/LinkedHashMap;

    .line 115
    .line 116
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    iget-object v3, v3, Ld/e;->a:Ld/b;

    .line 121
    .line 122
    const-string v4, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>"

    .line 123
    .line 124
    invoke-static {v3, v4}, Lkotlin/jvm/internal/j;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object v0, v0, Ld/h;->d:Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    invoke-interface {v3, v1}, Ld/b;->a(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_3
    :goto_1
    return-void

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
