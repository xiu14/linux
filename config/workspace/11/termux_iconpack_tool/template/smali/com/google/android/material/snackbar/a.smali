.class public final synthetic Lcom/google/android/material/snackbar/a;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/snackbar/a;->h:I

    iput-object p2, p0, Lcom/google/android/material/snackbar/a;->i:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/material/snackbar/a;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/l0;Lcom/google/android/material/snackbar/Snackbar;I)V
    .locals 0

    .line 2
    iput p3, p0, Lcom/google/android/material/snackbar/a;->h:I

    iput-object p1, p0, Lcom/google/android/material/snackbar/a;->j:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/material/snackbar/a;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/material/snackbar/a;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/snackbar/a;->j:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/material/snackbar/a;->i:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Ld5/l;

    .line 11
    .line 12
    check-cast v1, Ldev/jahir/kuper/data/models/RequiredApp;

    .line 13
    .line 14
    invoke-static {v2, v1, p1}, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder;->a(Ld5/l;Ldev/jahir/kuper/data/models/RequiredApp;Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast v2, Ld5/l;

    .line 19
    .line 20
    check-cast v1, Ldev/jahir/kuper/data/models/Component;

    .line 21
    .line 22
    invoke-static {v2, v1, p1}, Ldev/jahir/kuper/ui/viewholders/ComponentViewHolder;->a(Ld5/l;Ldev/jahir/kuper/data/models/Component;Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    check-cast v1, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;

    .line 27
    .line 28
    check-cast v2, Lcom/google/android/material/snackbar/Snackbar;

    .line 29
    .line 30
    invoke-static {v1, v2, p1}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->s(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;Lcom/google/android/material/snackbar/Snackbar;Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_2
    check-cast v2, Ldev/jahir/frames/ui/widgets/AboutButtonsLayout;

    .line 35
    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v2, v1, p1}, Ldev/jahir/frames/ui/widgets/AboutButtonsLayout;->a(Ldev/jahir/frames/ui/widgets/AboutButtonsLayout;Ljava/lang/String;Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_3
    check-cast v2, Ld5/p;

    .line 43
    .line 44
    check-cast v1, Ldev/jahir/frames/data/models/Wallpaper;

    .line 45
    .line 46
    invoke-static {v2, v1, p1}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->f(Ld5/p;Ldev/jahir/frames/data/models/Wallpaper;Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_4
    check-cast v2, Ldev/jahir/frames/ui/viewholders/WallpaperPaletteColorViewHolder;

    .line 51
    .line 52
    check-cast v1, Ln1/g;

    .line 53
    .line 54
    invoke-static {v2, v1, p1}, Ldev/jahir/frames/ui/viewholders/WallpaperPaletteColorViewHolder;->a(Ldev/jahir/frames/ui/viewholders/WallpaperPaletteColorViewHolder;Ln1/g;Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_5
    check-cast v2, Ld5/l;

    .line 59
    .line 60
    check-cast v1, Ldev/jahir/frames/data/models/Collection;

    .line 61
    .line 62
    invoke-static {v2, v1, p1}, Ldev/jahir/frames/ui/viewholders/CollectionViewHolder;->d(Ld5/l;Ldev/jahir/frames/data/models/Collection;Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_6
    check-cast v2, Ldev/jahir/blueprint/data/listeners/HomeItemsListener;

    .line 67
    .line 68
    check-cast v1, Ldev/jahir/blueprint/data/models/HomeMenuItem;

    .line 69
    .line 70
    invoke-static {v2, v1, p1}, Ldev/jahir/blueprint/ui/viewholders/MenuItemViewHolder;->a(Ldev/jahir/blueprint/data/listeners/HomeItemsListener;Ldev/jahir/blueprint/data/models/HomeMenuItem;Landroid/view/View;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_7
    check-cast v2, Ld5/l;

    .line 75
    .line 76
    check-cast v1, Ldev/jahir/blueprint/data/models/IconsCategory;

    .line 77
    .line 78
    invoke-static {v2, v1, p1}, Ldev/jahir/blueprint/ui/viewholders/IconsCategoryPreviewViewHolder;->a(Ld5/l;Ldev/jahir/blueprint/data/models/IconsCategory;Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :pswitch_8
    check-cast v2, Ldev/jahir/blueprint/data/listeners/HomeItemsListener;

    .line 83
    .line 84
    check-cast v1, Ldev/jahir/blueprint/data/models/Counter;

    .line 85
    .line 86
    invoke-static {v2, v1, p1}, Ldev/jahir/blueprint/ui/viewholders/CounterViewHolder;->a(Ldev/jahir/blueprint/data/listeners/HomeItemsListener;Ldev/jahir/blueprint/data/models/Counter;Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_9
    check-cast v2, Ldev/jahir/blueprint/data/listeners/HomeItemsListener;

    .line 91
    .line 92
    check-cast v1, Ldev/jahir/blueprint/data/models/HomeItem;

    .line 93
    .line 94
    invoke-static {v2, v1, p1}, Ldev/jahir/blueprint/ui/viewholders/AppLinkViewHolder;->a(Ldev/jahir/blueprint/data/listeners/HomeItemsListener;Ldev/jahir/blueprint/data/models/HomeItem;Landroid/view/View;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_a
    check-cast v1, Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 99
    .line 100
    check-cast v2, Lcom/google/android/material/snackbar/Snackbar;

    .line 101
    .line 102
    invoke-static {v1, v2, p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->j(Ldev/jahir/blueprint/ui/fragments/HomeFragment;Lcom/google/android/material/snackbar/Snackbar;Landroid/view/View;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_b
    check-cast v2, Lcom/google/android/material/snackbar/Snackbar;

    .line 107
    .line 108
    check-cast v1, Landroid/view/View$OnClickListener;

    .line 109
    .line 110
    sget-object v0, Lcom/google/android/material/snackbar/Snackbar;->E:[I

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-interface {v1, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 116
    .line 117
    .line 118
    const/4 p1, 0x1

    .line 119
    invoke-virtual {v2, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b(I)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
