.class public final Ldev/jahir/frames/data/db/FramesDatabase_Impl;
.super Ldev/jahir/frames/data/db/FramesDatabase;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field private final _favoritesDao:Lp4/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp4/c;"
        }
    .end annotation
.end field

.field private final _wallpaperDao:Lp4/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp4/c;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/db/FramesDatabase;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldev/jahir/frames/data/db/b;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Ldev/jahir/frames/data/db/b;-><init>(Ldev/jahir/frames/data/db/FramesDatabase_Impl;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Ldev/jahir/frames/data/db/FramesDatabase_Impl;->_wallpaperDao:Lp4/c;

    .line 15
    .line 16
    new-instance v0, Ldev/jahir/frames/data/db/b;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p0, v1}, Ldev/jahir/frames/data/db/b;-><init>(Ldev/jahir/frames/data/db/FramesDatabase_Impl;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Ldev/jahir/frames/data/db/FramesDatabase_Impl;->_favoritesDao:Lp4/c;

    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method private static final _favoritesDao$lambda$1(Ldev/jahir/frames/data/db/FramesDatabase_Impl;)Ldev/jahir/frames/data/db/FavoritesDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/frames/data/db/FavoritesDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldev/jahir/frames/data/db/FavoritesDao_Impl;-><init>(Landroidx/room/r0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method private static final _wallpaperDao$lambda$0(Ldev/jahir/frames/data/db/FramesDatabase_Impl;)Ldev/jahir/frames/data/db/WallpaperDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/frames/data/db/WallpaperDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldev/jahir/frames/data/db/WallpaperDao_Impl;-><init>(Landroidx/room/r0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method public static final synthetic access$internalInitInvalidationTracker(Ldev/jahir/frames/data/db/FramesDatabase_Impl;Ly1/a;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/room/r0;->internalInitInvalidationTracker(Ly1/a;)V

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

.method public static synthetic b(Ldev/jahir/frames/data/db/FramesDatabase_Impl;)Ldev/jahir/frames/data/db/FavoritesDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/frames/data/db/FramesDatabase_Impl;->_favoritesDao$lambda$1(Ldev/jahir/frames/data/db/FramesDatabase_Impl;)Ldev/jahir/frames/data/db/FavoritesDao_Impl;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic c(Ldev/jahir/frames/data/db/FramesDatabase_Impl;)Ldev/jahir/frames/data/db/WallpaperDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/frames/data/db/FramesDatabase_Impl;->_wallpaperDao$lambda$0(Ldev/jahir/frames/data/db/FramesDatabase_Impl;)Ldev/jahir/frames/data/db/WallpaperDao_Impl;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public clearAllTables()V
    .locals 2

    .line 1
    const-string v0, "wallpapers"

    .line 2
    .line 3
    const-string v1, "favorites"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1, v0}, Landroidx/room/r0;->performClear(Z[Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public createAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lj5/c;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Lt1/a;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "autoMigrationSpecs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p1
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

.method public createInvalidationTracker()Landroidx/room/n;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Landroidx/room/n;

    .line 12
    .line 13
    const-string v3, "wallpapers"

    .line 14
    .line 15
    const-string v4, "favorites"

    .line 16
    .line 17
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-direct {v2, p0, v0, v1, v3}, Landroidx/room/n;-><init>(Landroidx/room/r0;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v2
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

.method public createOpenDelegate()Landroidx/room/t0;
    .locals 1

    .line 2
    new-instance v0, Ldev/jahir/frames/data/db/FramesDatabase_Impl$createOpenDelegate$_openDelegate$1;

    invoke-direct {v0, p0}, Ldev/jahir/frames/data/db/FramesDatabase_Impl$createOpenDelegate$_openDelegate$1;-><init>(Ldev/jahir/frames/data/db/FramesDatabase_Impl;)V

    return-object v0
.end method

.method public bridge synthetic createOpenDelegate()Landroidx/room/u0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/data/db/FramesDatabase_Impl;->createOpenDelegate()Landroidx/room/t0;

    move-result-object v0

    return-object v0
.end method

.method public favoritesDao()Ldev/jahir/frames/data/db/FavoritesDao;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/db/FramesDatabase_Impl;->_favoritesDao:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/data/db/FavoritesDao;

    .line 8
    .line 9
    return-object v0
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

.method public getRequiredAutoMigrationSpecClasses()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lj5/c;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method public getRequiredTypeConverterClasses()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lj5/c;",
            "Ljava/util/List<",
            "Lj5/c;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Ldev/jahir/frames/data/db/WallpaperDao;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Ldev/jahir/frames/data/db/WallpaperDao_Impl;->Companion:Ldev/jahir/frames/data/db/WallpaperDao_Impl$Companion;

    .line 13
    .line 14
    invoke-virtual {v2}, Ldev/jahir/frames/data/db/WallpaperDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const-class v1, Ldev/jahir/frames/data/db/FavoritesDao;

    .line 22
    .line 23
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sget-object v2, Ldev/jahir/frames/data/db/FavoritesDao_Impl;->Companion:Ldev/jahir/frames/data/db/FavoritesDao_Impl$Companion;

    .line 28
    .line 29
    invoke-virtual {v2}, Ldev/jahir/frames/data/db/FavoritesDao_Impl$Companion;->getRequiredConverters()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    return-object v0
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public wallpapersDao()Ldev/jahir/frames/data/db/WallpaperDao;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/db/FramesDatabase_Impl;->_wallpaperDao:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/data/db/WallpaperDao;

    .line 8
    .line 9
    return-object v0
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
