.class public final Ln1/d;
.super Landroid/os/AsyncTask;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final synthetic a:Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;

.field public final synthetic b:Ln1/e;


# direct methods
.method public constructor <init>(Ln1/e;Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln1/d;->b:Ln1/e;

    .line 2
    .line 3
    iput-object p2, p0, Ln1/d;->a:Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.method public final doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, [Landroid/graphics/Bitmap;

    .line 2
    .line 3
    :try_start_0
    iget-object p1, p0, Ln1/d;->b:Ln1/e;

    .line 4
    .line 5
    invoke-virtual {p1}, Ln1/e;->a()Ln1/h;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    move-exception p1

    .line 11
    const-string v0, "Palette"

    .line 12
    .line 13
    const-string v1, "Exception thrown during async generate"

    .line 14
    .line 15
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1
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

.method public final onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ln1/h;

    .line 2
    .line 3
    iget-object v0, p0, Ln1/d;->a:Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;

    .line 4
    .line 5
    iget v1, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->h:I

    .line 6
    .line 7
    iget-object v0, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->i:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;

    .line 13
    .line 14
    invoke-static {v0, p1}, Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;->k(Ldev/jahir/blueprint/ui/fragments/dialogs/IconDialog;Ln1/h;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_0
    check-cast v0, Ldev/jahir/frames/ui/activities/ViewerActivity;

    .line 19
    .line 20
    invoke-static {v0, p1}, Ldev/jahir/frames/ui/activities/ViewerActivity;->A(Ldev/jahir/frames/ui/activities/ViewerActivity;Ln1/h;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
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
