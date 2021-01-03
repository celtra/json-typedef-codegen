
from dataclasses import dataclass

from enum import Enum

from typing import Any, Dict, List, Union, get_args, get_origin

def _from_json(cls, data):
    if data is None or cls in [bool, int, float, str] or cls is Any:
        return data
    if get_origin(cls) is Union:
        return _from_json(get_args(cls)[0], data)
    if get_origin(cls) is list:
        return [_from_json(get_args(cls)[0], d) for d in data]
    if get_origin(cls) is dict:
        return { k: _from_json(get_args(cls)[1], v) for k, v in data.items() }
    return cls.from_json(data)

def _to_json(data):
    if data is None or type(data) in [bool, int, float, str]:
        return data
    if type(data) is list:
        return [_to_json(d) for d in data]
    if type(data) is dict:
        return { k: _to_json(v) for k, v in data.items() }
    return data.to_json()
@dataclass
class RootOverrideTypeDiscriminator:
    """

    """

    Foo: str

    @classmethod
    def from_json(cls, data) -> "RootOverrideTypeDiscriminator":
        """
        Construct an instance of this class from parsed JSON data.
        """

        return {

            "bar": RootOverrideTypeDiscriminatorBar,

            "baz": RootOverrideTypeDiscriminatorBaz,

        }[data["foo"]].from_json(data)

    def to_json(self):
        """
        Generate JSON-ready data from an instance of this class.
        """

        pass # subclasses will implement this
@dataclass
class RootOverrideTypeDiscriminatorBar(RootOverrideTypeDiscriminator):
    """

    """



    @classmethod
    def from_json(cls, data) -> "RootOverrideTypeDiscriminatorBar":
        """
        Construct an instance of this class from parsed JSON data.
        """

        return cls(
            "bar",

        )

    def to_json(self):
        """
        Generate JSON-ready data from an instance of this class.
        """

        return {
            "foo": "bar",

        }
@dataclass
class RootOverrideTypeDiscriminatorBaz(RootOverrideTypeDiscriminator):
    """

    """



    @classmethod
    def from_json(cls, data) -> "RootOverrideTypeDiscriminatorBaz":
        """
        Construct an instance of this class from parsed JSON data.
        """

        return cls(
            "baz",

        )

    def to_json(self):
        """
        Generate JSON-ready data from an instance of this class.
        """

        return {
            "foo": "baz",

        }
class RootOverrideTypeEnum(Enum):
    """

    """


    BAR = "BAR"
    """

    """


    FOO = "FOO"
    """

    """



    @classmethod
    def from_json(cls, data) -> "RootOverrideTypeEnum":
        """
        Construct an instance of this class from parsed JSON data.
        """

        return cls(data)

    def to_json(self):
        """
        Generate JSON-ready data from an instance of this class.
        """

        return self.value
@dataclass
class RootOverrideTypeProperties:
    """

    """



    @classmethod
    def from_json(cls, data) -> "RootOverrideTypeProperties":
        """
        Construct an instance of this class from parsed JSON data.
        """

        return cls(

        )

    def to_json(self):
        """
        Generate JSON-ready data from an instance of this class.
        """

        return {

        }
@dataclass
class Root:
    """

    """


    OverrideElementsContainer: "List[str]"
    """

    """


    OverrideTypeDiscriminator: "RootOverrideTypeDiscriminator"
    """

    """


    OverrideTypeEnum: "RootOverrideTypeEnum"
    """

    """


    OverrideTypeExpr: "str"
    """

    """


    OverrideTypeProperties: "RootOverrideTypeProperties"
    """

    """


    OverrideValuesContainer: "Dict[str, str]"
    """

    """



    @classmethod
    def from_json(cls, data) -> "Root":
        """
        Construct an instance of this class from parsed JSON data.
        """

        return cls(

            _from_json(List[str], data["override_elements_container"]),

            _from_json(RootOverrideTypeDiscriminator, data["override_type_discriminator"]),

            _from_json(RootOverrideTypeEnum, data["override_type_enum"]),

            _from_json(str, data["override_type_expr"]),

            _from_json(RootOverrideTypeProperties, data["override_type_properties"]),

            _from_json(Dict[str, str], data["override_values_container"]),

        )

    def to_json(self):
        """
        Generate JSON-ready data from an instance of this class.
        """

        return {

            "override_elements_container": _to_json(self.OverrideElementsContainer),

            "override_type_discriminator": _to_json(self.OverrideTypeDiscriminator),

            "override_type_enum": _to_json(self.OverrideTypeEnum),

            "override_type_expr": _to_json(self.OverrideTypeExpr),

            "override_type_properties": _to_json(self.OverrideTypeProperties),

            "override_values_container": _to_json(self.OverrideValuesContainer),

        }
