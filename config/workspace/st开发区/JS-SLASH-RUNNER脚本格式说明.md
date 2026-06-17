# JS-SLASH-RUNNER 脚本格式说明

酒馆助手脚本库的导入格式为 **JSON 文件**（`.json`）。

---

## JSON 结构

```json
{
  "type": "script",
  "enabled": true,
  "name": "脚本显示名称",
  "id": "唯一标识符（UUID格式）",
  "content": "JavaScript代码（字符串，需转义）",
  "info": "脚本说明/作者信息",
  "button": {
    "enabled": true,
    "buttons": []
  },
  "data": {}
}
```

---

## 字段说明

| 字段 | 类型 | 必需 | 说明 |
|------|------|:----:|------|
| `type` | string | ✅ | 固定值 `"script"` |
| `enabled` | boolean | ✅ | 是否启用 |
| `name` | string | ✅ | 脚本名称 |
| `id` | string | ✅ | UUID 唯一标识 |
| `content` | string | ✅ | JS 代码（转义字符串） |
| `info` | string | ❌ | 描述/作者 |
| `button` | object | ❌ | 按钮配置 |
| `data` | object | ❌ | 自定义数据存储 |

---

## content 转义规则

| 字符 | 转义 |
|:----:|:----:|
| `"` | `\"` |
| `\` | `\\` |
| 换行 | `\n` |
| 制表符 | `\t` |

---

## UUID 生成

```javascript
crypto.randomUUID()
// 输出: "14e4bbbb-fcdf-4b4d-a079-f34c2fd54598"
```

或在线生成：https://www.uuidgenerator.net/

---

## ⚠️ 运行环境注意事项 (iframe)

js-slash-runner 脚本通常运行在 `iframe (about:srcdoc)` 环境中。这一特性导致脚本无法直接通过 `document` 访问宿主窗口（SillyTavern）的界面元素。

### 1. 访问 DOM 元素
若需操作 SillyTavern 界面元素（如发送按钮、输入框），必须使用 `window.parent.document`：

❌ **错误写法**：
```javascript
const btn = document.querySelector('#send_but'); // 只能获取 iframe 内部元素（通常为空）
```

✅ **正确写法**：
```javascript
const btn = window.parent.document.querySelector('#send_but');
```

### 2. 调用 SillyTavern API
全局对象（如 `SillyTavern`, `toastr`, `jQuery/$`）位于父窗口作用域，需通过 `window.parent` 访问：

```javascript
// 获取上下文
const context = window.parent.SillyTavern.getContext();

// 显示 Toast 提示
window.parent.toastr.success('操作成功');

// 使用 jQuery
window.parent.$('#element_id').click();
```

### 3. 等待元素加载
由于脚本可能在 UI 渲染完成前执行，建议使用 `MutationObserver` 或轮询机制等待目标元素出现后再执行初始化逻辑。
