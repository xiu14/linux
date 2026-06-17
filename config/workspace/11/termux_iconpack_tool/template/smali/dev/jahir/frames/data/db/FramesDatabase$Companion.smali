.class public final Ldev/jahir/frames/data/db/FramesDatabase$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldev/jahir/frames/data/db/FramesDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/db/FramesDatabase$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final destroyInstance()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ldev/jahir/frames/data/db/FramesDatabase;->access$setINSTANCE$cp(Ldev/jahir/frames/data/db/FramesDatabase;)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method public final getAppDatabase(Landroid/content/Context;)Ldev/jahir/frames/data/db/FramesDatabase;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ldev/jahir/frames/data/db/FramesDatabase;->access$getINSTANCE$cp()Ldev/jahir/frames/data/db/FramesDatabase;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "getApplicationContext(...)"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->name:Ljava/lang/String;

    .line 26
    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    const-string p1, "Frames"

    .line 30
    .line 31
    :cond_0
    const-class v1, Ldev/jahir/frames/data/db/FramesDatabase;

    .line 32
    .line 33
    invoke-static {v0, v1, p1}, Landroidx/room/d0;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/j0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p1, Landroidx/room/j0;->p:Z

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p1, Landroidx/room/j0;->q:Z

    .line 42
    .line 43
    iput-boolean v0, p1, Landroidx/room/j0;->r:Z

    .line 44
    .line 45
    invoke-virtual {p1}, Landroidx/room/j0;->b()Landroidx/room/r0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ldev/jahir/frames/data/db/FramesDatabase;

    .line 50
    .line 51
    invoke-static {p1}, Ldev/jahir/frames/data/db/FramesDatabase;->access$setINSTANCE$cp(Ldev/jahir/frames/data/db/FramesDatabase;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-static {}, Ldev/jahir/frames/data/db/FramesDatabase;->access$getINSTANCE$cp()Ldev/jahir/frames/data/db/FramesDatabase;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1
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
.end method
