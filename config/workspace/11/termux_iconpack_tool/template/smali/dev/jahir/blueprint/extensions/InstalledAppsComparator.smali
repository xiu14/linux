.class public final Ldev/jahir/blueprint/extensions/InstalledAppsComparator;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroid/content/pm/ResolveInfo;",
        ">;"
    }
.end annotation


# instance fields
.field private final packageManager:Landroid/content/pm/PackageManager;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Ldev/jahir/blueprint/extensions/InstalledAppsComparator;-><init>(Landroid/content/pm/PackageManager;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/pm/PackageManager;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldev/jahir/blueprint/extensions/InstalledAppsComparator;->packageManager:Landroid/content/pm/PackageManager;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/pm/PackageManager;ILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Ldev/jahir/blueprint/extensions/InstalledAppsComparator;-><init>(Landroid/content/pm/PackageManager;)V

    return-void
.end method


# virtual methods
.method public compare(Landroid/content/pm/ResolveInfo;Landroid/content/pm/ResolveInfo;)I
    .locals 6

    .line 2
    iget-object v0, p0, Ldev/jahir/blueprint/extensions/InstalledAppsComparator;->packageManager:Landroid/content/pm/PackageManager;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 3
    :cond_0
    const-string v2, ""

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    move-object v0, v2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz p2, :cond_3

    .line 4
    iget-object v3, p0, Ldev/jahir/blueprint/extensions/InstalledAppsComparator;->packageManager:Landroid/content/pm/PackageManager;

    invoke-virtual {p2, v3}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v3

    if-nez v3, :cond_4

    :cond_3
    move-object v3, v2

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-static {v0}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_7

    if-eqz p1, :cond_5

    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-eqz p1, :cond_5

    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    goto :goto_0

    :cond_5
    move-object p1, v5

    :goto_0
    if-nez p1, :cond_6

    move-object v0, v2

    goto :goto_1

    :cond_6
    move-object v0, p1

    .line 6
    :cond_7
    :goto_1
    invoke-static {v3}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_a

    if-eqz p2, :cond_8

    iget-object p1, p2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-eqz p1, :cond_8

    iget-object v5, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    :cond_8
    if-nez v5, :cond_9

    goto :goto_2

    :cond_9
    move-object v2, v5

    :goto_2
    move-object v3, v2

    .line 7
    :cond_a
    invoke-static {v0}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_b

    invoke-static {v3}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_b

    return v1

    .line 8
    :cond_b
    invoke-static {v0}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_c

    const/4 p1, -0x1

    return p1

    .line 9
    :cond_c
    invoke-static {v3}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_d

    const/4 p1, 0x1

    return p1

    .line 10
    :cond_d
    invoke-virtual {v0, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    return v1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Landroid/content/pm/ResolveInfo;

    check-cast p2, Landroid/content/pm/ResolveInfo;

    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/extensions/InstalledAppsComparator;->compare(Landroid/content/pm/ResolveInfo;Landroid/content/pm/ResolveInfo;)I

    move-result p1

    return p1
.end method
