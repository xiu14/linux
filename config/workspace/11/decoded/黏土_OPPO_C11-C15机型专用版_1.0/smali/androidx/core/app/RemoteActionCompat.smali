.class public final Landroidx/core/app/RemoteActionCompat;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Li2/c;


# instance fields
.field public a:Landroidx/core/graphics/drawable/IconCompat;

.field public b:Ljava/lang/CharSequence;

.field public c:Ljava/lang/CharSequence;

.field public d:Landroid/app/PendingIntent;

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/core/app/RemoteActionCompat;->a:Landroidx/core/graphics/drawable/IconCompat;

    .line 3
    iput-object p2, p0, Landroidx/core/app/RemoteActionCompat;->b:Ljava/lang/CharSequence;

    .line 4
    iput-object p3, p0, Landroidx/core/app/RemoteActionCompat;->c:Ljava/lang/CharSequence;

    .line 5
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    iput-object p4, p0, Landroidx/core/app/RemoteActionCompat;->d:Landroid/app/PendingIntent;

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Landroidx/core/app/RemoteActionCompat;->e:Z

    .line 8
    iput-boolean p1, p0, Landroidx/core/app/RemoteActionCompat;->f:Z

    return-void
.end method
