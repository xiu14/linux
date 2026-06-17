.class public Landroidx/work/impl/background/systemalarm/SystemAlarmService;
.super Landroidx/lifecycle/z;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final k:Ljava/lang/String;


# instance fields
.field public i:Lo2/h;

.field public j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "SystemAlarmService"

    .line 2
    .line 3
    invoke-static {v0}, Ll2/t;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->k:Ljava/lang/String;

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

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/z;-><init>()V

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
.method public final a()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->j:Z

    .line 3
    .line 4
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->k:Ljava/lang/String;

    .line 9
    .line 10
    const-string v3, "All commands completed in dispatcher"

    .line 11
    .line 12
    invoke-virtual {v1, v2, v3}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lv2/l;->a:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v2, Lv2/m;->a:Lv2/m;

    .line 23
    .line 24
    monitor-enter v2

    .line 25
    :try_start_0
    sget-object v3, Lv2/m;->b:Ljava/util/WeakHashMap;

    .line 26
    .line 27
    invoke-interface {v1, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    monitor-exit v2

    .line 31
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/util/Map$Entry;

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Landroid/os/PowerManager$WakeLock;

    .line 56
    .line 57
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v3, :cond_0

    .line 64
    .line 65
    invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-ne v3, v0, :cond_0

    .line 70
    .line 71
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    sget-object v4, Lv2/l;->a:Ljava/lang/String;

    .line 76
    .line 77
    new-instance v5, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string v6, "WakeLock held for "

    .line 80
    .line 81
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v3, v4, v2}, Ll2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    monitor-exit v2

    .line 101
    throw v0
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

.method public final onCreate()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/lifecycle/z;->onCreate()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lo2/h;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lo2/h;-><init>(Landroidx/work/impl/background/systemalarm/SystemAlarmService;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->i:Lo2/h;

    .line 10
    .line 11
    iget-object v1, v0, Lo2/h;->p:Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Lo2/h;->r:Ljava/lang/String;

    .line 20
    .line 21
    const-string v2, "A completion listener for SystemAlarmDispatcher already exists."

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Ll2/t;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iput-object p0, v0, Lo2/h;->p:Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 28
    .line 29
    :goto_0
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->j:Z

    .line 31
    .line 32
    return-void
    .line 33
.end method

.method public final onDestroy()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/lifecycle/z;->onDestroy()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->j:Z

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->i:Lo2/h;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lo2/h;->r:Ljava/lang/String;

    .line 17
    .line 18
    const-string v3, "Destroying SystemAlarmDispatcher"

    .line 19
    .line 20
    invoke-virtual {v1, v2, v3}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, Lo2/h;->k:Lm2/d;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lm2/d;->g(Lm2/a;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-object v1, v0, Lo2/h;->p:Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 30
    .line 31
    return-void
    .line 32
    .line 33
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    .line 2
    .line 3
    .line 4
    iget-boolean p2, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->j:Z

    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    sget-object v0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->k:Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "Re-initializing SystemAlarmDispatcher after a request to shut-down."

    .line 15
    .line 16
    invoke-virtual {p2, v0, v1}, Ll2/t;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object p2, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->i:Lo2/h;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Lo2/h;->r:Ljava/lang/String;

    .line 29
    .line 30
    const-string v2, "Destroying SystemAlarmDispatcher"

    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p2, Lo2/h;->k:Lm2/d;

    .line 36
    .line 37
    invoke-virtual {v0, p2}, Lm2/d;->g(Lm2/a;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iput-object v0, p2, Lo2/h;->p:Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 42
    .line 43
    new-instance p2, Lo2/h;

    .line 44
    .line 45
    invoke-direct {p2, p0}, Lo2/h;-><init>(Landroidx/work/impl/background/systemalarm/SystemAlarmService;)V

    .line 46
    .line 47
    .line 48
    iput-object p2, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->i:Lo2/h;

    .line 49
    .line 50
    iget-object v0, p2, Lo2/h;->p:Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    const-string v0, "A completion listener for SystemAlarmDispatcher already exists."

    .line 59
    .line 60
    invoke-virtual {p2, v1, v0}, Ll2/t;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    iput-object p0, p2, Lo2/h;->p:Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 65
    .line 66
    :goto_0
    const/4 p2, 0x0

    .line 67
    iput-boolean p2, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->j:Z

    .line 68
    .line 69
    :cond_1
    if-eqz p1, :cond_2

    .line 70
    .line 71
    iget-object p2, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->i:Lo2/h;

    .line 72
    .line 73
    invoke-virtual {p2, p1, p3}, Lo2/h;->a(Landroid/content/Intent;I)V

    .line 74
    .line 75
    .line 76
    :cond_2
    const/4 p1, 0x3

    .line 77
    return p1
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
