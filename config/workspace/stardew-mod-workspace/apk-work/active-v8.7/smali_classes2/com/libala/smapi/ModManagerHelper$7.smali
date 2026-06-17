.class Lcom/libala/smapi/ModManagerHelper$7;
.super Ljava/lang/Object;
.source "ModManagerHelper.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/ModManagerHelper;->listMods(Ljava/io/File;Ljava/util/Properties;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/libala/smapi/ModManagerHelper$ModEntry;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 270
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/libala/smapi/ModManagerHelper$ModEntry;Lcom/libala/smapi/ModManagerHelper$ModEntry;)I
    .locals 0

    .line 273
    iget-object p1, p1, Lcom/libala/smapi/ModManagerHelper$ModEntry;->displayName:Ljava/lang/String;

    iget-object p2, p2, Lcom/libala/smapi/ModManagerHelper$ModEntry;->displayName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 270
    check-cast p1, Lcom/libala/smapi/ModManagerHelper$ModEntry;

    check-cast p2, Lcom/libala/smapi/ModManagerHelper$ModEntry;

    invoke-virtual {p0, p1, p2}, Lcom/libala/smapi/ModManagerHelper$7;->compare(Lcom/libala/smapi/ModManagerHelper$ModEntry;Lcom/libala/smapi/ModManagerHelper$ModEntry;)I

    move-result p1

    return p1
.end method
