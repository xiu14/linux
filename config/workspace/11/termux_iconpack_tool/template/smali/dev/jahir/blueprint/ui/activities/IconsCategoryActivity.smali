.class public final Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;
.super Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity<",
        "Ldev/jahir/frames/data/Preferences;",
        ">;"
    }
.end annotation


# static fields
.field public static final CATEGORY_KEY:Ljava/lang/String; = "category"

.field public static final Companion:Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity$Companion;

.field public static final PICKER_KEY:Ljava/lang/String; = "picker_key"


# instance fields
.field private final blueprintPrefs$delegate:Lp4/c;

.field private category:Ldev/jahir/blueprint/data/models/IconsCategory;

.field private iconDialog:Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;

.field private final iconsAdapter$delegate:Lp4/c;

.field private iconsShapePickerDialog:Landroidx/appcompat/app/r;

.field private pickerKey:I

.field private final preferences$delegate:Lp4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->Companion:Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity$Companion;

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
    .locals 2

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldev/jahir/blueprint/ui/activities/j;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/j;-><init>(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->preferences$delegate:Lp4/c;

    .line 15
    .line 16
    new-instance v0, Ldev/jahir/blueprint/ui/activities/j;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/j;-><init>(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->blueprintPrefs$delegate:Lp4/c;

    .line 27
    .line 28
    new-instance v0, Ldev/jahir/blueprint/ui/activities/j;

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/j;-><init>(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->iconsAdapter$delegate:Lp4/c;

    .line 39
    .line 40
    return-void
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

.method public static final synthetic access$onIconClick(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;Ldev/jahir/blueprint/data/models/Icon;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->onIconClick(Ldev/jahir/blueprint/data/models/Icon;Landroid/graphics/drawable/Drawable;)V

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

.method private static final blueprintPrefs_delegate$lambda$1(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;)Ldev/jahir/blueprint/data/BlueprintPreferences;
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/blueprint/data/BlueprintPreferences;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldev/jahir/blueprint/data/BlueprintPreferences;-><init>(Landroid/content/Context;)V

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

.method private final dismissIconDialog()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->iconDialog:Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/y;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->iconDialog:Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    :catch_0
    return-void
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

.method private final dismissIconsShapesDialog()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->iconsShapePickerDialog:Landroidx/appcompat/app/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/app/s0;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->iconsShapePickerDialog:Landroidx/appcompat/app/r;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    :catch_0
    return-void
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

.method private final getBlueprintPrefs()Ldev/jahir/blueprint/data/BlueprintPreferences;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->blueprintPrefs$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/blueprint/data/BlueprintPreferences;

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

.method private final getIconsAdapter()Ldev/jahir/blueprint/ui/adapters/IconsAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->iconsAdapter$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

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

.method private static final iconsAdapter_delegate$lambda$3(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;)Ldev/jahir/blueprint/ui/adapters/IconsAdapter;
    .locals 6

    .line 1
    new-instance v0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

    .line 2
    .line 3
    new-instance v1, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity$iconsAdapter$2$1;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity$iconsAdapter$2$1;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget v2, Ldev/jahir/blueprint/R$bool;->icon_name_in_grid_list:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x0

    .line 13
    invoke-static {p0, v2, v3, v4, v5}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean$default(Landroid/content/Context;IZILjava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-direct {v0, v3, v1, v2}, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;-><init>(ZLd5/p;Z)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object p0, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->category:Ldev/jahir/blueprint/data/models/IconsCategory;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Ldev/jahir/blueprint/data/models/IconsCategory;->getIcons()Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    :cond_0
    if-nez v5, :cond_1

    .line 31
    .line 32
    sget-object v5, Lq4/r;->h:Lq4/r;

    .line 33
    .line 34
    :cond_1
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->setIcons(Ljava/util/ArrayList;)V

    .line 38
    .line 39
    .line 40
    return-object v0
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
.end method

.method private static final onCreate$lambda$4(Lp4/c;)Landroidx/appcompat/widget/Toolbar;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp4/c;",
            ")",
            "Landroidx/appcompat/widget/Toolbar;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/appcompat/widget/Toolbar;

    .line 6
    .line 7
    return-object p0
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

.method private static final onCreate$lambda$6(Lp4/c;)Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp4/c;",
            ")",
            "Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;

    .line 6
    .line 7
    return-object p0
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

.method private final onIconClick(Ldev/jahir/blueprint/data/models/Icon;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget v0, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->pickerKey:I

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-static {p0, p1, p2, v0}, Ldev/jahir/blueprint/extensions/IconKt;->pickIcon(Landroidx/fragment/app/q0;Ldev/jahir/blueprint/data/models/Icon;Landroid/graphics/drawable/Drawable;I)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    invoke-direct {p0, p1}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->showIconDialog(Ldev/jahir/blueprint/data/models/Icon;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method private static final preferences_delegate$lambda$0(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;)Ldev/jahir/frames/data/Preferences;
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/frames/data/Preferences;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldev/jahir/frames/data/Preferences;-><init>(Landroid/content/Context;)V

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

.method private final showIconDialog(Ldev/jahir/blueprint/data/models/Icon;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->dismissIconDialog()V

    .line 5
    .line 6
    .line 7
    sget-object v0, Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;->Companion:Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog$Companion;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog$Companion;->create(Ldev/jahir/blueprint/data/models/Icon;)Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->iconDialog:Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;->show(Landroidx/fragment/app/q0;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
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

.method private final showIconsShapePickerDialog()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->dismissIconsShapesDialog()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldev/jahir/blueprint/ui/activities/i;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/i;-><init>(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->mdDialog(Landroid/content/Context;Ld5/l;)Landroidx/appcompat/app/r;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->iconsShapePickerDialog:Landroidx/appcompat/app/r;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
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

.method private static final showIconsShapePickerDialog$lambda$10(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 4

    .line 1
    const-string v0, "$this$mdDialog"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Ldev/jahir/blueprint/R$string;->icon_shape:I

    .line 7
    .line 8
    invoke-static {p1, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->title(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 9
    .line 10
    .line 11
    sget v0, Ldev/jahir/blueprint/R$array;->icon_shapes_options:I

    .line 12
    .line 13
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->getBlueprintPrefs()Ldev/jahir/blueprint/data/BlueprintPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ldev/jahir/blueprint/data/BlueprintPreferences;->getIconShape()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    new-instance v2, Ldev/jahir/blueprint/ui/activities/g;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-direct {v2, v3}, Ldev/jahir/blueprint/ui/activities/g;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0, v1, v2}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->singleChoiceItems(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;IILd5/p;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 28
    .line 29
    .line 30
    new-instance v0, Ldev/jahir/blueprint/ui/activities/i;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {v0, p0, v1}, Ldev/jahir/blueprint/ui/activities/i;-><init>(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;I)V

    .line 34
    .line 35
    .line 36
    const p0, 0x104000a

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p0, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->positiveButton(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;ILd5/l;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
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

.method private static final showIconsShapePickerDialog$lambda$10$lambda$8(Landroid/content/DialogInterface;I)Lp4/k;
    .locals 0

    .line 1
    const-string p1, "<unused var>"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 7
    .line 8
    return-object p0
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

.method private static final showIconsShapePickerDialog$lambda$10$lambda$9(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;Landroid/content/DialogInterface;)Lp4/k;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Landroidx/appcompat/app/r;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, Landroidx/appcompat/app/r;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Landroidx/appcompat/app/r;->m:Landroidx/appcompat/app/q;

    .line 19
    .line 20
    iget-object v1, v0, Landroidx/appcompat/app/q;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 21
    .line 22
    :cond_1
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/widget/AbsListView;->getCheckedItemCount()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    const/4 v0, 0x0

    .line 30
    :goto_1
    if-lez v0, :cond_4

    .line 31
    .line 32
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->getBlueprintPrefs()Ldev/jahir/blueprint/data/BlueprintPreferences;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ldev/jahir/blueprint/data/BlueprintPreferences;->getIconShape()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/widget/AbsListView;->getCheckedItemPosition()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    goto :goto_2

    .line 47
    :cond_3
    const/4 v1, -0x1

    .line 48
    :goto_2
    if-eq v1, v0, :cond_4

    .line 49
    .line 50
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->getBlueprintPrefs()Ldev/jahir/blueprint/data/BlueprintPreferences;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, v1}, Ldev/jahir/blueprint/data/BlueprintPreferences;->setIconShape(I)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->getIconsAdapter()Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 62
    .line 63
    .line 64
    :cond_4
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 68
    .line 69
    return-object p0
    .line 70
    .line 71
.end method

.method public static synthetic u(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;)Ldev/jahir/blueprint/data/BlueprintPreferences;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->blueprintPrefs_delegate$lambda$1(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;)Ldev/jahir/blueprint/data/BlueprintPreferences;

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

.method public static synthetic v(Landroid/content/DialogInterface;I)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->showIconsShapePickerDialog$lambda$10$lambda$8(Landroid/content/DialogInterface;I)Lp4/k;

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

.method public static synthetic w(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;)Ldev/jahir/frames/data/Preferences;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->preferences_delegate$lambda$0(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;)Ldev/jahir/frames/data/Preferences;

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

.method public static synthetic x(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;)Ldev/jahir/blueprint/ui/adapters/IconsAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->iconsAdapter_delegate$lambda$3(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;)Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

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

.method public static synthetic y(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;Landroid/content/DialogInterface;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->showIconsShapePickerDialog$lambda$10$lambda$9(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;Landroid/content/DialogInterface;)Lp4/k;

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

.method public static synthetic z(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->showIconsShapePickerDialog$lambda$10(Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

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
.method public getMenuRes()I
    .locals 1

    .line 1
    sget v0, Ldev/jahir/blueprint/R$menu;->icons_toolbar_menu:I

    .line 2
    .line 3
    return v0
    .line 4
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

.method public getPreferences()Ldev/jahir/frames/data/Preferences;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->preferences$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/data/Preferences;

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

.method public getSearchHint(I)Ljava/lang/String;
    .locals 2

    .line 1
    sget p1, Ldev/jahir/blueprint/R$string;->search_icons:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x2

    .line 5
    invoke-static {p0, p1, v0, v1, v0}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

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

.method public internalDoSearch(Ljava/lang/String;Z)V
    .locals 6

    .line 1
    const-string v0, "filter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->internalDoSearch(Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sget-object v1, Lq4/r;->h:Lq4/r;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    if-nez p2, :cond_4

    .line 19
    .line 20
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->getIconsAdapter()Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->category:Ldev/jahir/blueprint/data/models/IconsCategory;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Ldev/jahir/blueprint/data/models/IconsCategory;->getIcons()Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v0, v2

    .line 34
    :goto_0
    if-nez v0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object v1, v0

    .line 38
    :goto_1
    new-instance v0, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :cond_2
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    move-object v4, v3

    .line 58
    check-cast v4, Ldev/jahir/blueprint/data/models/Icon;

    .line 59
    .line 60
    invoke-virtual {v4}, Ldev/jahir/blueprint/data/models/Icon;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    const/4 v5, 0x1

    .line 65
    invoke-static {v4, v2, v5, v2}, Ldev/jahir/frames/extensions/resources/StringKt;->lower$default(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-static {p1, v2, v5, v2}, Ldev/jahir/frames/extensions/resources/StringKt;->lower$default(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-static {v4, v5}, Ll5/e;->l0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2, p1}, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->setIcons(Ljava/util/ArrayList;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->getIconsAdapter()Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    new-instance p2, Ljava/util/ArrayList;

    .line 97
    .line 98
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->category:Ldev/jahir/blueprint/data/models/IconsCategory;

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    invoke-virtual {v0}, Ldev/jahir/blueprint/data/models/IconsCategory;->getIcons()Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    :cond_5
    if-nez v2, :cond_6

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_6
    move-object v1, v2

    .line 110
    :goto_3
    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, p2}, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->setIcons(Ljava/util/ArrayList;)V

    .line 114
    .line 115
    .line 116
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 11

    .line 1
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget p1, Ldev/jahir/blueprint/R$layout;->activity_icons_category:I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/u;->setContentView(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const-string v1, "picker_key"

    .line 17
    .line 18
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    :goto_0
    iput p1, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->pickerKey:I

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v1, 0x0

    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 34
    .line 35
    const/16 v3, 0x21

    .line 36
    .line 37
    if-lt v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, Landroidx/appcompat/app/h0;->m(Landroid/content/Intent;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Landroid/os/Parcelable;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-string v2, "category"

    .line 47
    .line 48
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    instance-of v2, p1, Ldev/jahir/blueprint/data/models/IconsCategory;

    .line 53
    .line 54
    if-nez v2, :cond_2

    .line 55
    .line 56
    move-object p1, v1

    .line 57
    :cond_2
    check-cast p1, Ldev/jahir/blueprint/data/models/IconsCategory;

    .line 58
    .line 59
    :goto_1
    check-cast p1, Ldev/jahir/blueprint/data/models/IconsCategory;

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move-object p1, v1

    .line 63
    :goto_2
    iput-object p1, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->category:Ldev/jahir/blueprint/data/models/IconsCategory;

    .line 64
    .line 65
    if-nez p1, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_4
    sget p1, Ldev/jahir/blueprint/R$id;->toolbar:I

    .line 72
    .line 73
    new-instance v2, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity$onCreate$$inlined$findView$default$1;

    .line 74
    .line 75
    invoke-direct {v2, p0, p1, v0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity$onCreate$$inlined$findView$default$1;-><init>(Landroid/app/Activity;IZ)V

    .line 76
    .line 77
    .line 78
    invoke-static {v2}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->onCreate$lambda$4(Lp4/c;)Landroidx/appcompat/widget/Toolbar;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {p0, v2}, Landroidx/appcompat/app/u;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->onCreate$lambda$4(Lp4/c;)Landroidx/appcompat/widget/Toolbar;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {p0, v2}, Landroidx/appcompat/app/u;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getSupportActionBar()Landroidx/appcompat/app/a;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    const/4 v3, 0x1

    .line 101
    if-eqz v2, :cond_5

    .line 102
    .line 103
    invoke-virtual {v2}, Landroidx/appcompat/app/a;->r()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v3}, Landroidx/appcompat/app/a;->m(Z)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Landroidx/appcompat/app/a;->n()V

    .line 110
    .line 111
    .line 112
    :cond_5
    invoke-static {p1}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->onCreate$lambda$4(Lp4/c;)Landroidx/appcompat/widget/Toolbar;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    if-eqz v2, :cond_7

    .line 117
    .line 118
    iget-object v4, p0, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->category:Ldev/jahir/blueprint/data/models/IconsCategory;

    .line 119
    .line 120
    if-eqz v4, :cond_6

    .line 121
    .line 122
    invoke-virtual {v4}, Ldev/jahir/blueprint/data/models/IconsCategory;->getTitle()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    if-eqz v4, :cond_6

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_6
    invoke-static {p0}, Ldev/jahir/frames/extensions/context/ContextKt;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    :goto_3
    invoke-virtual {v2, v4}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    :cond_7
    invoke-static {p1}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->onCreate$lambda$4(Lp4/c;)Landroidx/appcompat/widget/Toolbar;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    if-eqz p1, :cond_8

    .line 141
    .line 142
    invoke-static {p1, v0, v3, v1}, Ldev/jahir/frames/extensions/views/ToolbarKt;->tint$default(Landroidx/appcompat/widget/Toolbar;IILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_8
    sget p1, Ldev/jahir/blueprint/R$id;->recycler_view:I

    .line 146
    .line 147
    new-instance v2, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity$onCreate$$inlined$findView$default$2;

    .line 148
    .line 149
    invoke-direct {v2, p0, p1, v0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity$onCreate$$inlined$findView$default$2;-><init>(Landroid/app/Activity;IZ)V

    .line 150
    .line 151
    .line 152
    invoke-static {v2}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-static {p1}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->onCreate$lambda$6(Lp4/c;)Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    if-eqz v2, :cond_9

    .line 161
    .line 162
    invoke-static {v2}, Ldev/jahir/frames/extensions/views/FastScrollRecyclerViewKt;->tint(Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;)V

    .line 163
    .line 164
    .line 165
    :cond_9
    invoke-static {p1}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->onCreate$lambda$6(Lp4/c;)Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    const/4 v4, 0x4

    .line 170
    if-eqz v2, :cond_a

    .line 171
    .line 172
    new-instance v5, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 173
    .line 174
    sget v6, Ldev/jahir/blueprint/R$integer;->icons_columns_count:I

    .line 175
    .line 176
    invoke-static {p0, v6, v4}, Ldev/jahir/frames/extensions/context/ContextKt;->integer(Landroid/content/Context;II)I

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    invoke-direct {v5, v6, v0}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(II)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/p1;)V

    .line 184
    .line 185
    .line 186
    :cond_a
    invoke-static {p1}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->onCreate$lambda$6(Lp4/c;)Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    if-eqz v2, :cond_b

    .line 191
    .line 192
    new-instance v5, Ldev/jahir/frames/ui/decorations/GridSpacingItemDecoration;

    .line 193
    .line 194
    sget v6, Ldev/jahir/blueprint/R$integer;->icons_columns_count:I

    .line 195
    .line 196
    invoke-static {p0, v6, v4}, Ldev/jahir/frames/extensions/context/ContextKt;->integer(Landroid/content/Context;II)I

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    sget v4, Ldev/jahir/frames/R$dimen;->grids_spacing:I

    .line 201
    .line 202
    const/4 v7, 0x2

    .line 203
    invoke-static {p0, v4, v0, v7, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->dimenPixelSize$default(Landroid/content/Context;IIILjava/lang/Object;)I

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    const/4 v9, 0x4

    .line 208
    const/4 v10, 0x0

    .line 209
    const/4 v8, 0x0

    .line 210
    invoke-direct/range {v5 .. v10}, Ldev/jahir/frames/ui/decorations/GridSpacingItemDecoration;-><init>(IIZILkotlin/jvm/internal/e;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/l1;)V

    .line 214
    .line 215
    .line 216
    :cond_b
    invoke-static {p1}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->onCreate$lambda$6(Lp4/c;)Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-eqz v0, :cond_c

    .line 221
    .line 222
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->getIconsAdapter()Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v0, v1}, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;->setAdapter(Landroidx/recyclerview/widget/c1;)V

    .line 227
    .line 228
    .line 229
    :cond_c
    invoke-static {p1}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->onCreate$lambda$6(Lp4/c;)Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    if-eqz p1, :cond_d

    .line 234
    .line 235
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 236
    .line 237
    .line 238
    :cond_d
    return-void
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 5

    .line 1
    const-string v0, "menu"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseSearchableActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    sget v1, Ldev/jahir/blueprint/R$id;->icons_shape:I

    .line 11
    .line 12
    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v2, 0x1a

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-lt v1, v2, :cond_0

    .line 24
    .line 25
    sget v1, Ldev/jahir/blueprint/R$bool;->includes_adaptive_icons:I

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-static {p0, v1, v3, v2, v4}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean$default(Landroid/content/Context;IZILjava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    :cond_0
    invoke-interface {p1, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 37
    .line 38
    .line 39
    :cond_1
    return v0
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
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->dismissIconsShapesDialog()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->dismissIconDialog()V

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
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const v1, 0x102002c

    .line 11
    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sget v1, Ldev/jahir/blueprint/R$id;->icons_shape:I

    .line 24
    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->showIconsShapePickerDialog()V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
    .line 35
    .line 36
    .line 37
.end method
